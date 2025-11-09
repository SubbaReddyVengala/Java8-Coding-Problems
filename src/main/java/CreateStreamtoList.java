import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamtoList {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Apple", "Banana", "Cherry", "Date");

        List<String> list = stream.collect(Collectors.toList());
        System.out.println("Converting Stream to List: " + list);

        Stream<String> stream1 = Stream.of("A", "B", "C", "A");
        Set<String> set = stream1.collect(Collectors.toSet());
        System.out.println("Converting Stream to Set: " + set);

        Stream<String> stream2 = Stream.of("A", "B", "C", "A");
        String[] array = stream2.toArray(String[]::new);
        System.out.println("Converting Stream to Array: " + Arrays.toString(array));

        List<String> list1 = Arrays.asList("X", "Y", "Z");
        List<String> list2 = Arrays.asList("1", "2", "3");

        List<String> mergedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        System.out.println("Merging two Lists using Stream: " + mergedList);
    }
}
