package Inheritance.Question3;

public class Warehouse {
    private double capacity=0;                  //Capacity of warehose;
    private double balance=0;                   //Amount of space occupied;
    private double spaceLeft=this.capacity;     //Amount of space left;
    
    public Warehouse(double capacity) {
        if(capacity > 0) {
            this.capacity = capacity;
            this.spaceLeft = capacity;
        }
    }
    
    public double getCapacity() {
        return this.capacity;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public double howMuchSpaceLeft() {
        return this.spaceLeft;
    }
    
    private void updateSpaceLeft() {
        this.spaceLeft = this.capacity - this.balance;
    }
    
    public void addToWarehouse(double amount) {
        if(amount >= this.capacity || amount >= this.spaceLeft) {
            this.balance = this.capacity;
            this.updateSpaceLeft();
        }
        else {
            this.balance += amount;
            this.updateSpaceLeft();
        }
    }

    public double takeFromWarehouse(double amount) {
        if(amount >= this.capacity || amount >= this.balance) {
            this.balance = 0;
            updateSpaceLeft();
            return this.capacity;
        }
        if(amount<0) {
            return 0;
        }

        this.balance -= amount;
        this.updateSpaceLeft();
        return amount;
    }
 
    public String toString() {
        return "Balance = " + this.getBalance() + " Space Left = " + this.howMuchSpaceLeft(); 
    }
}