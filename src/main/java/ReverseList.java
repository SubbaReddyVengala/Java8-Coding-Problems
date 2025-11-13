import java.util.*;
import java.util.stream.Collectors;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> reversed = new ArrayList<>(numbers);
        Collections.reverse(reversed);
        System.out.println("Reversed List: " + reversed);

        List<Integer> result = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted in Descending Order: " + result);
    }
}
