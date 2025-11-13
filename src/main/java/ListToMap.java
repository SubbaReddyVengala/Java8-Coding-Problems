import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Subbu", "Reddy", "Java", "Streams");
        // Convert List to Map where key is the string and value is the length of the string
        Map<String, Integer> map = names.stream().collect(Collectors.toMap(str -> str, str -> str.length()));
        // Print the resulting map
        System.out.println(map);

        Map<String, Integer> map1 = names.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map1);

        List<String> names1 = Arrays.asList("Subbu", "Reddy", "Java", "Streams", "Java");
        Map<String, Integer> map2 = names1.stream().collect(Collectors.toMap(Function.identity(), String::length, (existing, deplicate) -> existing));
        System.out.println(map2);

    }
}
