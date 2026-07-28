
public class Main {

    public static void main(String[] args) {
        StringConcatenator stringConcatenator = new StringConcatenator();
        String result = stringConcatenator.concatenate("Hello", ", ", "varArgs", "!");
        System.out.println(result);
    }

}