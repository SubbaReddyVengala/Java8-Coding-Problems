import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(40, 10, 30, 20, 50);
        Collections.sort(numbers);
        System.out.println("Sorted numbers in ascending order: " + numbers);

        numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted numbers using streams in ascending order: " + numbers);

        numbers.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Sorted numbers using streams with natural order in ascending order: " + numbers);


    }
}
