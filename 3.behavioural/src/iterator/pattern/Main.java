package iterator.pattern;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"};
        CollectionOfNames collectionOfNames = new CollectionOfNames(names);


        for (Iterator iter = collectionOfNames.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println(name);
        }

    }
}
