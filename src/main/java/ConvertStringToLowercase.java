import java.util.List;

public class ConvertStringToLowercase {
    public static void main(String[] args) {

        String originalString = "VENGALA SUBBA REDDY";
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("Original String: " + originalString);
        System.out.println("Lowercase String: " + lowerCaseString);

        List<String> stringList = List.of("VENGALA", "SUBBA", "REDDY");
        List<String> lowerCaseList = stringList.stream()
                                               .map(String::toLowerCase)
                                               .toList();
        System.out.println("Original List: " + stringList);
        System.out.println("Lowercase List: " + lowerCaseList);

        List<String> lowerCaseListWithLambda = stringList.stream()
                .map(str -> str.toLowerCase())
                .toList();
        System.out.println("lowerCase ListWithLambda: " + lowerCaseListWithLambda);

    }
}
