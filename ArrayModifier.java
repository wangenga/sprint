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
        }
        if (index2 < 0){
            index2 = 0;
        }

        for (int i = 0; i < sz - 1; i++){
            if (list.get(i) >= index1 && list.get(i) < index2){
                list.remove(i);
            }
        }
        return list;
    }
}
