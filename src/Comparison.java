import java.util.Map;
import java.util.stream.Collectors;

public class Comparison {
    public void stringComp(int n, String s) {
        Map<Character, Long> charMap = (Map<Character, Long>) s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        charMap.forEach((character, aLong) -> {
            if (aLong > 1) {
                System.out.println(character + "  " + aLong);
            }
        });

    }
}
