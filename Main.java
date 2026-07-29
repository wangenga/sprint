import java.util.Arrays;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        WordLengthAnalyzer analyzer = new WordLengthAnalyzer();
        Map<Integer, Integer> result = analyzer.analyzeWordLengths(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        System.out.println(result);
    }
}