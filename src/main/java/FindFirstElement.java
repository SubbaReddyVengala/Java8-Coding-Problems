import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstElement {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");
        String firstItem = items.stream().findFirst().orElse("No items found");
        System.out.println("First item: " + firstItem);

        String firstItem1 = items.stream().limit(1).collect(Collectors.toList()).get(0);
        System.out.println("First item using limit: " + firstItem1);

        //first even number from a stream
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 4, 6);
        Integer firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst().orElse(null);
        System.out.println("First even number: " + firstEven);

        Integer firstEven1 = numbers.stream().filter(n -> n % 2 == 0).reduce((a, b) -> a).orElse(null);
        System.out.println("First even number using reduce: " + firstEven1);

    }
}
