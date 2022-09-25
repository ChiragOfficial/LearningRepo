package DataStructures;
//import java.awt.Point;
public class test {
    public static void change(String s) {
        s = new String("So confusing");
    }
    public static void main(String[] args) {
        String p = new String("test");
        change(p);
        System.err.println(p);
    }
}