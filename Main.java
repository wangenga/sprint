import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StreamPolice processor = new StreamPolice();
        List<Integer> numbers = Arrays.asList(-10, 15, 20, 30, 8, -3, 5, 10, 50, 12);
        List<Integer> result = processor.processNumbers(numbers);
        System.out.println(result);
    }
}