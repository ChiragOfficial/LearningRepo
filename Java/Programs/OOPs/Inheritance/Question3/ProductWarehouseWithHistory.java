package Inheritance.Question3;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    ChangeHistory history;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.addStatus(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) { 
        amount = super.takeFromWarehouse(amount);
        this.history.addStatus(this.getBalance());
        return amount;
    }

    public void printAnalysis() {
        System.out.println("Largest Amount of Product: "+ this.history.maxValue()+
        "\nSmallest Amount of Product: " + this.history.minValue());
    }
    public String history() {
        return this.history.toString();
    }
}
