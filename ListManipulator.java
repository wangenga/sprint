//package sprint;

import java.util.List;
import java.util.ArrayList;

public class ListManipulator {

    public List<String> manipulateList(List<String> list) {
        int n = list.size();

        if ( n > 0){
            list.remove(n-1); 
        }
        if (!list.isEmpty()){
            list.set(list.size() - 1,"The size of the list is " + n);
        }
        
        list.add("last");
        list.add(0, "first");
        return list;
    }
    
}