package sprint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsernameProcessor {
    public String findFirstUsername(List<String> name){
        return name.stream()
        .findFirst()
        .orElse("Anonymous");
    }
}