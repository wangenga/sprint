import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UsernameProcessor processor = new UsernameProcessor();
        List<String> usernames = Arrays.asList("usr", "user12", "test", "validUser", "12345");
        String firstUsername = processor.findFirstUsername(usernames);
        System.out.println(firstUsername);
    }
}