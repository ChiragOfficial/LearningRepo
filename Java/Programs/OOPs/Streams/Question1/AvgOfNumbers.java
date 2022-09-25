package Streams.Question1;
import java.util.Scanner;
import java.util.ArrayList;
public class AvgOfNumbers {
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String tempInput = sc.nextLine();
            if(tempInput.equals("end")){
                break;
            }
            else{
                inputs.add(tempInput);
            }
        }
        sc.close();
        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        System.out.println(average);
    }
}
