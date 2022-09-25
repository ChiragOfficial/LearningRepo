package Streams.Question3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class PositiveIntegers {
    public static void main(String[] args) {
        List<Integer>inputs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String tempInput = sc.nextLine();
            if(tempInput.equals("end")){
                break;
            }
            else{
                inputs.add(Integer.valueOf(tempInput));
            }
        }
        sc.close();
        List<Integer>positiveIntegers = inputs.stream().filter(number -> number>0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(positiveIntegers);
    }
}
