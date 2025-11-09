import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyElement {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");
        String anyItem = items.stream().findAny().orElse("No items found");
        System.out.println("Any item: " + anyItem);

        // any even number from a stream
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 4, 6);
        Integer anyEven = numbers.stream().filter(n -> n % 2 == 0).findAny().orElse(null);
        System.out.println("Any even number: " + anyEven);

        Optional<Integer> anyEvenParallel = numbers.parallelStream().filter(n -> n % 2 == 0).findAny();
        System.out.println("Any even number from parallel stream: " + anyEvenParallel.orElse(null));
    }
}
