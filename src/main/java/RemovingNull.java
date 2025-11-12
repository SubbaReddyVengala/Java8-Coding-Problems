import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class RemovingNull {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Subbu", null, "Reddy", null, "Java", "Streams");

        List<String> filteredNames = names.stream().filter(Objects::nonNull).toList();
        System.out.println("Filtered names (non-null): " + filteredNames);

        List<String> filterNames1 = names.stream().filter(x -> x != null).toList();
        System.out.println("Filtered names using lambda: " + filterNames1);

        List<String> filterNames2 = names.stream().flatMap(x -> Optional.ofNullable(x).stream()).toList();
        System.out.println("Removing null using Optional.ofNullable: " + filterNames2);
    }
}
