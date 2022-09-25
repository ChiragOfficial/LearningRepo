package Inheritance.Question3;

public class ProductWarehouse extends Warehouse{
    private String productName;
    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = new String(productName);
    }
    public String getName() {
        return this.productName;
    }
    @Override
    public String toString() {
        return this.getName() + ": " + super.toString();
    }
}
