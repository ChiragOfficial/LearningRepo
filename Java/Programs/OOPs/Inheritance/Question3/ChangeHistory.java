package Inheritance.Question3;
import java.util.ArrayList;
import java.util.Collections;
public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    public void addStatus(double status) {
        this.history.add(status);
    }
    public void clear() {
        this.history.clear();
    }
    public double maxValue(){
        if(this.history.isEmpty()) return 0;
        return Collections.max(this.history);
    }
    public double minValue() {
        if(this.history.isEmpty()) return 0;
        return Collections.min(this.history);
    }
    public double average() {
        Double sum = 0.0;
        if(!(this.history.isEmpty())){
            for(Double d: this.history) {
                sum += d;
            }
            sum.doubleValue();
            return sum/this.history.size();
        }
        return sum.doubleValue();
    }
    public String toString() {
        return this.history.toString();
    }
}
