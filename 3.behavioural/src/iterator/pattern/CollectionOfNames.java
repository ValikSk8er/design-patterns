package iterator.pattern;

public class CollectionOfNames implements Container {
    private final String[] name;

    public CollectionOfNames(String[] name) {
        this.name = name;
    }

    @Override
    public Iterator getIterator() {
        return new CollectionOfNamesIterate();
    }

    private class CollectionOfNamesIterate implements Iterator{
        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[i++];
            }

            return null;
        }
    }
}
