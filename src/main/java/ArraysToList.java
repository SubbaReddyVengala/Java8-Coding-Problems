import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysToList {
    public static void main(String[] args) {
        String[] names = {"Subbu", "Reddy", "Java", "Streams"};
        List<String> list = Arrays.asList(names);
        list.forEach(System.out::println);// The returned list is fixed-size — you can’t add/remove elements.

        List<String> list1 = Stream.of(names).collect(Collectors.toList());
        list1.forEach(System.out::println);// This creates a mutable list, so you can modify it later (add, remove, etc.).

        List<String> list2 = Arrays.stream(names).collect(Collectors.toList());
        System.out.println("Using Arrays.stream():");
        list2.forEach(System.out::println);
    }
}
