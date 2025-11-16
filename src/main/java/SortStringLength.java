import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "hi", "banana", "cat", "watermelon");
        List<String> result = list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(result);

        List<String> result1 = list.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();
        System.out.println(result1);

        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
        System.out.println(list);

        Collections.sort(list, (s1, s2) -> s2.length() - s1.length());
        System.out.println(list);
    }
}
