package FileIO;
import java.util.Scanner;
import java.nio.file.Paths;
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Name of the file:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        try{
            Scanner fileReader = new Scanner(Paths.get("C:\\Users\\chira\\Documents\\Java\\Programs\\FileIO\\"+input));
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                String[] splitData = data.split(",");
                String name = splitData[0];
                int age = Integer.valueOf(splitData[1]);
                System.out.println("Name: "+name+" | "+"Age: "+age);
            }
        }
        catch(Exception e){
            System.out.println("Exception Occured: "+e);
        }
    }
}
