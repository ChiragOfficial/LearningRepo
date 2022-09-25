package Inheritance.Question1;

public class C extends B{
    public void c() {
        System.out.println("C");
    }
    public static void main(String[] args) {
        C c = new C();
        c.c();
    }
}
