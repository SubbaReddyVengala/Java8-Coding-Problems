import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimit {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
        List<Integer> result = numbers.stream().skip(3).collect(Collectors.toList());
        System.out.println("Skipping first 3 elements : " + result);

        List<Integer> result1 = numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limiting first 3 elements : " + result1);
    }
}
