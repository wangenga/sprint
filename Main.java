import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        List<Integer> numbers = Arrays.asList(3, 5, 12, 20, 7, 10);

        Optional<Integer> result = processor.processNumbers(numbers);
        System.out.println(result);
    }

}