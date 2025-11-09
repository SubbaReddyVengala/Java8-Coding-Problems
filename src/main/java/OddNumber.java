import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OddNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers.stream()
                                          .filter(n -> n%2!=0)
                                          .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers);

        Predicate<Integer> isOdd = n -> n % 2 != 0;
        List<Integer> oddNumbersUsingPredicate = numbers.stream()
                                                        .filter(isOdd)
                                                        .collect(Collectors.toList());
        System.out.println("Odd Numbers using Predicate: " + oddNumbersUsingPredicate);
    }
}
