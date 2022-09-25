package Inheritance.Question2;

public class Student extends Person {
    private int credits=0;
    public Student(String name, String location) {
        super(name, location);
    }
    public int credits() {
        return this.credits;
    }
    public void study() {
        this.credits++;
    }
    @Override
    public String toString() {
        return super.toString() + "\n\tStudy Credits "+ this.credits;
    }
}