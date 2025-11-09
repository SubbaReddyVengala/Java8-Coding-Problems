import java.util.List;
import java.util.stream.Collectors;

public class CountNoOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long count = numbers.stream().count();
        System.out.println("Total number of elements: " + count);

        long count1 = numbers.size();
        System.out.println("Total number of elements using size(): " + count1);

        long count2 = numbers.stream().collect(Collectors.counting());
        System.out.println("Total number of elements using Collectors.counting(): " + count2);

        long count3 = numbers.stream().map(n -> 1).reduce(0, Integer::sum);
        System.out.println("Total number of elements using map and reduce: " + count3);
    }
}
