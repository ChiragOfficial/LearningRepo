package Exceptions;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    private void setName(String name){
        if(name == null|| name.equals("")||name.length()>40){
            throw new IllegalArgumentException("Given name is invalid.");
        }
        else{
            this.name = name;
        }
    }
    private void setAge(int age){
        if(age<0 || age>120){
            throw new IllegalArgumentException("Given age is invalid.");
        }
        else{
            this.age = age;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
