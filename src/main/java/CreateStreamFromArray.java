import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStreamFromArray {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        Stream<String> stream = Arrays.stream(names);
        stream.forEach(System.out::println);

        Stream<String> streamOf = Stream.of(names);
        System.out.println("Using Stream.of():");
        streamOf.forEach(System.out::println);


    }
}
