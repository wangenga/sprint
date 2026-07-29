package sprint;

import java.util.stream.Collectors;
import java.util.List;

public class EmailDomainExtractor {
    public List<String> extractDomains(List<String> email){
        char target = '@';

        return email.stream()
            .filter(n -> n.indexOf(target) > 0 && n.indexOf(target) < n.length() -1 && n.indexOf(target) == n.lastIndexOf(target))
            .map(n -> n.substring(n.indexOf(target)+ 1))
            .map(String::toLowerCase)
            .distinct()
            .collect(Collectors.toList());
    }
}