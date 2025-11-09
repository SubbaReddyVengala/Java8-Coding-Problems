import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverStringToUpperCase {
    public static void main(String[] args) {
        String input = "vengala subba reddy";
        String upperCaseString = input.toUpperCase();
        System.out.println("Original String: " + input);
        System.out.println("Uppercase String: " + upperCaseString);

        List<String> stringList = Arrays.asList("apple", "banana", "cherry");
        List<String> upperCaseList = stringList.stream()
                                               .map(String::toUpperCase)//Method Reference
                                               .collect(Collectors.toList());
        System.out.println("Original List: " + stringList);
        System.out.println("Uppercase List: " + upperCaseList);

        List<String> upperCaseListLambda =stringList.stream()
                                                    .map(str -> str.toUpperCase())//Lambda Expression
                                                    .toList();//Java 16 supports toList() method
        System.out.println("Uppercase List using Lambda: " + upperCaseListLambda);


    }
}
