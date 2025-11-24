import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
    public static void main(String[] args) {
        //Solution 1: Using Streams and LinkedHashMap
        Map<String,Integer> map = new HashMap<>();
        map.put("subbu",12);
        map.put("ravi",2);
        map.put("kavi",32);
        map.put("balu",22);


        Map<String, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println("Sorted Map: " + sorted
        );
        //Solution 2: Sort in Reverse Order
        //Solution 3: Using TreeMap with Custom Comparator


    }
}
