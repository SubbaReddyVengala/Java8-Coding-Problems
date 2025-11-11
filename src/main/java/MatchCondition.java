import java.util.Arrays;
import java.util.List;

public class MatchCondition {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10,80);
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All numbers are even: " + allEven);

        boolean anyGreaterThan50 = numbers.stream().anyMatch(n -> n > 50);
        System.out.println("Any number greater than 50: " + anyGreaterThan50);

        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("No number is negative: " + noneNegative);



    }
}
