package Streams.Question4;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Main {
    public static boolean divisibleByTwoThreeFive(int number){
        return number%2 == 0 || number%3==0 || number%5 == 0;
    }
    public static ArrayList<Integer> divisible(ArrayList<Integer>numbers){
        return numbers.stream().filter(s->divisibleByTwoThreeFive(s)).collect(Collectors.toCollection(ArrayList::new));
    }
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(num -> System.out.println(num));
    }
}
