package sprint;
import java.util.ArrayList;
import java.util.List;

public class ArrayFilter {
    public int[][] filterBySum (int[][] x, int target){
        List<int[]> z = new ArrayList<>();

        for (int[] row : x){
            int sum = 0;
            for (int num: row){
                sum += num;
            }
            if (sum >= target){
                z.add(row);
            }
        }
        return z.toArray(new int [0][]);
    }
}