package Streams.Question2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class AvgOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String>inputs=new ArrayList<>();
        while(true){
            String tempInput=sc.nextLine();
            if(tempInput.equals("end")){
                break;
            }
            else{
                inputs.add(tempInput);
            }
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String tempInput = sc.nextLine();
        System.out.print("Average of ");
        if(tempInput.equals("p")){
            System.out.print("positive numbers: "+inputs.stream().mapToInt(s->Integer.valueOf(s)).filter(number->number>=0).average().getAsDouble());
        }
        if(tempInput.equals("n")){
            System.out.print("negative numbers: "+inputs.stream().mapToInt(s->Integer.valueOf(s)).filter(number->number<0).average().getAsDouble());
        }
        sc.close();
    }
}
