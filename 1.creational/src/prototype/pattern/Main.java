package prototype.pattern;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Test", 21);
        System.out.println(person);

        Person clone = person.getClone();
        System.out.println(clone);
    }
}
