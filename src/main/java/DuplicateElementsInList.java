import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,2,3,4,5,6,7,8,9,1);
        List<Integer> duplicates = numbers.stream()
                .filter(i -> numbers.indexOf(i) != numbers.lastIndexOf(i))
                .distinct()
                .toList();
        System.out.println("Duplicate elements using indexOf and lastIndexOf: " + duplicates);

        List<Integer> duplicates1 =numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Duplicate elements using groupingBy: " + duplicates1);

        Set<Integer> duplicatesSet = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for(Integer num:numbers){
            if(!seen.add(num)){
                duplicatesSet.add(num);
            }
        }
        System.out.println("Duplicate elements using Sets: " + duplicatesSet);


    }
}
