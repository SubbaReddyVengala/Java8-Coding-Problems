import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescendingOrder {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "David","Subbu");
        List<String> desc = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted names in descending order: " + desc);

        desc.stream().sorted(Comparator.comparing(String::toString)).collect(Collectors.toList());
        System.out.println("Sorted names using streams with custom comparator in descending order: " + desc);
    }
}
