import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestShortestStringInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "orange", "fig");
        String longest = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("Longest string: " + longest);

        String smallest = list.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("Smallest string: " + smallest);

        String longest1 = list.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .findFirst()
                .orElse(null);
        System.out.println("Longest string (sorted): " + longest1);

        String shortest = list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .findFirst()
                .orElse(null);
        System.out.println("Shortest string (sorted): " + shortest);

        String longest2 = list.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        String::length
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Longest string (toMap): " + longest2);
    }
}
