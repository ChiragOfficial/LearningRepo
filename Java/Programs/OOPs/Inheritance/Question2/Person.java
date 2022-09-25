package Inheritance.Question2;
import java.util.ArrayList;

public class Person {
    private final String name;
    private String location;
    Person(String name,String location) {
        this.name = new String(name);
        this.location = location;
    }
    public void changeLocation(String location) {
        this.location = location;
    }
    public String toString() {
        return this.name + "\n\t" + this.location;
    }
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ram", "22nd Street, Bangalore, Karnataka, India"));
        persons.add(new Person("Shyam", "21st Street, Bangalore, Karnataka, India"));
        persons.add(new Person("Nama", "Somewhere over the rainbow"));
        System.out.println(persons);
    }
}
