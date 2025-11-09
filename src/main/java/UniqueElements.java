import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        long uniqueNumbersCount = numbers.stream().distinct().count();
        System.out.println("Count of unique numbers: " + uniqueNumbersCount);

        long uniqueNumbersCount1 = numbers.stream().collect(Collectors.toSet()).size();
        System.out.println("Count of unique numbers using Set: " + uniqueNumbersCount1);

        long uniqueNumbersCount2 = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).keySet().size();
        System.out.println("Count of unique numbers using GroupingBy: " + uniqueNumbersCount2);
    }
}
