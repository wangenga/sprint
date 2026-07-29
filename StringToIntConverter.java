package sprint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToIntConverter {
    public List<Integer> convertStringListToIntList(List<String> num){
        return num.stream()
        .map(Integer::valueOf)
        .collect(Collectors.toList());
    }
}