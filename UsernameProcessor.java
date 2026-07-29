//package sprint;
import java.util.List;

public class UsernameProcessor {
    public String findFirstUsername(List<String> name){
        return name.stream()
        .findFirst()
        .orElse("Anonymous");
    }
}