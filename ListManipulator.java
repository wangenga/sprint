package sprint;

import java.util.List;
import java.util.ArrayList;

public class ListManipulator {

    public List<String> manipulateList(List<String> list) {
        int n = list.size();

        if ( n > 0){
            list.remove(n-1); 
        }
        list.add("The size of the list is " + n--);
        list.add(n + 1, "last");
        list.add(0, "first");
        return list;
    }
    
}