package FileIO;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of file: ");
        String input = sc.nextLine();
        ArrayList<String> listOfGuest = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(Paths.get("C:\\Users\\chira\\Documents\\Java\\Programs\\FileIO\\"+input));
            while(scanner.hasNextLine()){
                if(scanner.nextLine().isEmpty()){
                    continue;
                }
                listOfGuest.add(scanner.nextLine());
            }
        }
        catch(Exception e) {
            System.out.println("Exceptions Occured: "+e);
        }
        while(true){
            System.out.println("Enter names, an empty line quits.");
            input = sc.nextLine();
            if(input.isEmpty()){
                break;
            }
            else{
                if(listOfGuest.contains(input)){
                    System.out.println(input+" is in the guest list.");
                }
                else{
                    System.out.println("The name is not on the list.");
                }
            }
        }
        sc.close();
    }
}
