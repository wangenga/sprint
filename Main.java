
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringToIntConverter converter = new StringToIntConverter();
        List<String> input = Arrays.asList("23", "45", "-15");
        List<Integer> result = converter.convertStringListToIntList(input);
        System.out.println(result);
    }
}