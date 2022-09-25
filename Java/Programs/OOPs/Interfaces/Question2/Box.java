package Interfaces.Question2;
import java.util.ArrayList;
public class Box implements Packables{
    private ArrayList<Packables> items;
    private double maxWeight;
    private double currentWeight;
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.items = new ArrayList<>();
    }
    public void add(Packables item){
        if(isUnderMaxWeight(item)){
            this.items.add(item);
            this.currentWeight+=item.weight();
        }
    }
    private boolean isUnderMaxWeight(Packables item) {
        double tempWeight = this.currentWeight;
        tempWeight+=item.weight();
        if(tempWeight<this.maxWeight){
            return true;
        }
        return false;
    }
    public double weight(){
        return this.currentWeight;
    }
    public String toString() {
        return "Box: "+this.items.size()+", Total Weight: "+this.weight()+" kg";
    }
}
