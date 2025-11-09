import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamtoList {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Apple", "Banana", "Cherry", "Date");

        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }
}
