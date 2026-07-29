//package sprint;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;

public class WordLengthAnalyzer {
    public Map<Integer, Integer> analyzeWordLengths(List<String> words) {
        return words.stream()
            .collect(Collectors.groupingBy(String::length, Collectors.summingInt(word -> 1)));
    }
}