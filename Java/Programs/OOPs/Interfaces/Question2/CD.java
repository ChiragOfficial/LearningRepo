package Interfaces.Question2;

public class CD implements Packables{
    private String artist;
    private String nameOfCD;
    private int year;
    private double weight=0.1;
    public CD(String artist, String nameOfCD, int year) {
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.year = year;
    }
    public double weight(){
        return this.weight;
    }
    public String toString(){
        return this.artist+": "+this.nameOfCD+" ("+this.year+")";
    }
}
