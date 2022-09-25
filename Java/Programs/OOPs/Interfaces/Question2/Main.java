package Interfaces.Question2;

public class Main {
    public static void main(String[] args){
        Box box = new Box(10);
        box.add(new Book("Rudyard Kipling", "Once Upon A Time in Monsoon", 3));
        System.out.println(box);
    }
}
