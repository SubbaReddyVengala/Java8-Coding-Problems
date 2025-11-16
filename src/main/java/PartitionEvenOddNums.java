import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOddNums {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Group numbers by even and odd
        Map<Boolean, List<Integer>> gropedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(gropedNumbers);

        Map<Boolean, Long> result = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()));
        System.out.println(result);

        Map<Integer, List<Integer>> result1 = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2));
        System.out.println(result1);
    }
}
