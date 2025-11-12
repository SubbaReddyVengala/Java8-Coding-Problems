import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 1, 4);

        // Finding maximum value using reduce
        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Maximum value: " + max);

        // Finding minimum value using reduce
        int min = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println("Minimum value: " + min);

        int max1 = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum value using max(): " + max1);

        int min1 = numbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum value using min(): " + min1);

        int max2 = numbers.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println("Maximum value using custom comparator: " + max2);

        int min2 = numbers.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println("Minimum value using custom comparator: " + min2);


    }
}
