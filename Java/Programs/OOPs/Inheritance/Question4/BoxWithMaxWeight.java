package Inheritance.Question4;
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int maxWeight;
    private ArrayList<Item> listOfItems;
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.listOfItems = new ArrayList<>();
    }
    public void add(Item item) {
        int sum = 0;
        for(int i = 0; i<this.listOfItems.size(); i++) {
            sum += this.listOfItems.get(i).getWeight();
        }
        if(sum<this.maxWeight) {
            this.listOfItems.add(item);
        }
    }
    public boolean isInBox(Item item) {
        if(this.listOfItems.contains(item)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
    }
}
