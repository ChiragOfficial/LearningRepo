package FileIO;
import java.util.Scanner;
import java.nio.file.Paths;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String input = sc.nextLine();
        sc.close();
        try{
            Scanner scanner = new Scanner(Paths.get("C:\\Users\\chira\\Documents\\Java\\Programs\\FileIO\\"+input));
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch(Exception e){
            System.out.println("Exceptions Occured: "+e);
        }
    }
}
