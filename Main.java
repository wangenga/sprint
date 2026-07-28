import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.5);
        list.add(2.5);
        list.add(3.5);
        list.add(4.5);
        list.add(5.5);

        ArrayList<Double> result = ArrayModifier.removeElementsBetween(list, 1, 3);

        for (double num : result) {
            System.out.print(num + " ");
        }
    }
}