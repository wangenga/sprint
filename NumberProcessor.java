//package sprint;

import java.util.List;
import java.util.Optional;

public class NumberProcessor {
    public Optional<Integer> processNumbers(List<Integer> num){
        return num.stream()
            .filter(n -> n >= 10)
            .reduce((a, b) -> a * b);

    }
}