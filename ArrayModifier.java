package sprint;

import java.util.ArrayList;
import java.util.List;

public class ArrayModifier {
    public static ArrayList<Double> removeElementsBetween(ArrayList<Double> list, int index1, int index2) {
        if (index1 > index2){
            int temp = index1;
            index1 = index2;
            index2 = temp;
        }
        int sz = list.size();

        if (index1 < 0 ){
            index1 = 0;
        } else if (index1 > sz){
            index1 = sz;
        }

        if (index2 < 0){
            index2 = 0;
        } else if (index2 > sz){
            index2 = sz;
        }

        for (int i = index2 - 1; i >= index1; i--){
            list.remove(i);
        }
        return list;
    }
}
