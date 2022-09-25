package FileIO;
import java.util.Scanner;
import java.nio.file.Paths;
public class Question1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(Paths.get("C:\\Users\\chira\\Documents\\Java\\Programs\\FileIO\\data.txt"))){
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                System.out.println(row);
            }
        }
        catch(Exception e){
            System.out.println("Exception occured: "+e);
        }   
    }
}
