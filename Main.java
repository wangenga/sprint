import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmailDomainExtractor extractor = new EmailDomainExtractor();
        List<String> emails = Arrays.asList(
                "USER1@EXAMPLE.COM",
                "user2@Example.com",
                "user1@EXAMPLE.COM",
                "user3@SAMPLE.ORG",
                "INVALIDEMAIL@",
                "user4@SAMPLE.ORG"
        );
        List<String> domains = extractor.extractDomains(emails);
        domains.forEach(System.out::println);
    }
}