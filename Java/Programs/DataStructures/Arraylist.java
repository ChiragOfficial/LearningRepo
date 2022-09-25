package DataStructures;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        System.out.println(array.get(0));
        System.out.println(array.contains("hello"));
    }    
}
