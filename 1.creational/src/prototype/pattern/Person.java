package prototype.pattern;

public class Person implements PersonPrototype {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Person getClone() {
        return new Person(this.name, this.age);
    }
}
