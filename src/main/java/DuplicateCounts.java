import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCounts {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 10, 40, 20, 50, 10);

        List<Integer> duplicateList = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicateList);

        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicateList1 = numbers.stream().filter(n -> !seen.add(n)).distinct().collect(Collectors.toList());
        System.out.println("Duplicate elements (method 2): " + duplicateList1);

        Map<Integer, Long> duplicateCounts = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        duplicateCounts.forEach((key, value) -> {
            if (value > 1) {
                System.out.println("Element " + key + " occurs " + value + " times");
            }
        });
    }
}
