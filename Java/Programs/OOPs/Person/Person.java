package Person;
//import java.util.*;

public class Person {
    private final String name;
    private SimpleDate dateOfBirth;

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.dateOfBirth = date;
    }

    public Person(String name, byte day, byte month, short year) {
        this(name, new SimpleDate(day, month, year));
    }

    public String getName() {
        return this.name;
    }

    
    public SimpleDate getDOB() {
        return (SimpleDate) this.dateOfBirth;
    }
    
    public boolean isOlderThan(Person person) {
        if(this.dateOfBirth.compareDate(person.dateOfBirth)) {
            return true;
        }

        else return false;
    }
}
