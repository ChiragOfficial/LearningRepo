package Inheritance.Question4;

public class Item {
    private String name;
    private int weight=0;

    public Item(String name) {
        this.name = name;
    }
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object item) {
        if(this == item) {
            return true;
        }
        if(!(item instanceof Item)) {
            return false;
        }
        Item comparedItem = (Item) item;
        if(this.name == comparedItem.name) {
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        if(this.name == null) return 0;
        return this.name.hashCode();
    }
    
}
