import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CommaSepartedString {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        String strings = numbers.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(strings);

        String result1 = numbers.stream().map(n -> n.toString()).collect(Collectors.joining(","));
        System.out.println(result1);

        String result2 = numbers.stream().map(Objects::toString).collect(Collectors.joining(","));
        System.out.println(result2);

        String result3 =numbers.stream().map(String::valueOf).reduce((a, b) -> a + "," + b).orElse("");
        System.out.println(result3);
    }
}
