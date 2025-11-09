import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uninqueNumbers = numbers.stream().distinct().toList();
        System.out.println("removing duplicates with distinct() method : " + uninqueNumbers);

        List<Integer> uniqueNumbers1 = numbers.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
        System.out.println("removing duplicates with Collectors.toSet() method : " + uniqueNumbers1);

        List<Integer> uniqueNumbers2 = new HashSet<>(numbers).stream().toList();
        System.out.println("removing duplicates with HashSet constructor : " + uniqueNumbers2);

        List<Integer> uniqueNumbers3 = numbers.stream().collect(Collectors.toCollection(LinkedHashSet::new)).stream().toList();
        System.out.println("removing duplicates with LinkedHashSet : " + uniqueNumbers3);

        Set<Integer> seen = new HashSet<>();
        List<Integer> uniqueNumbers4 = numbers.stream().filter(n -> seen.add(n)).toList();
        System.out.println("removing duplicates with filter() method : " + uniqueNumbers4);
    }
}
