package Inheritance.Question2;
import java.util.ArrayList;
public class Main {
    public static void printPersons(ArrayList<Person> persons) {
        for(Person person: persons) {
            System.out.println(person);
        }
    }
    public static void main(String[] args) {
       Person olliePerson = new Student("Ollie", "Some Location");
       System.out.println(olliePerson);
       olliePerson.changeLocation("Some Other Location");
    }
}