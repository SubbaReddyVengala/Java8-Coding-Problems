import java.util.Arrays;
import java.util.List;

public class SumNumbersWithMapToInt {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: " + sum);

        int sum1= numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of numbers using reduce: " + sum1);

        int sum2 =numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum of numbers using reduce with lambda: " + sum2);

        int sum3 = numbers.stream().mapToInt(n->n).sum();
        System.out.println("Sum of numbers using mapToInt with lambda: " + sum3);


    }
}
