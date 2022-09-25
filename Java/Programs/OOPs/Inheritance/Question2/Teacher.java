package Inheritance.Question2;

public class Teacher extends Person{
    private int salary;
    Teacher(String name, String location, int salary) {
        super(name, location);
        this.salary = salary;
    }
    public int getSalarry() {
        return this.salary;
    }
    @Override
    public String toString() {
        return super.toString() + "\n\tsalary " + this.salary +" euro/month";
    }
}