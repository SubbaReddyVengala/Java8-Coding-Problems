import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uninqueNumbers = numbers.stream().distinct().toList();
        System.out.println(uninqueNumbers);

        List<Integer> uniqueNumbers1 = numbers.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
        System.out.println(uniqueNumbers1);

        List<Integer> uniqueNumbers2 = new HashSet<>(numbers).stream().toList();
        System.out.println(uniqueNumbers2);

        List<Integer> uniqueNumbers3 = numbers.stream().collect(Collectors.toCollection(LinkedHashSet::new)).stream().toList();
        System.out.println(uniqueNumbers3);
    }
}
