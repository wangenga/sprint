//package sprint;

import java.util.List;

public class ListManipulator {

    public List<String> manipulateList(List<String> list) {
        int n = list.size();

        if ( n > 0){
            list.remove(n-1); 
        }
        if (!list.isEmpty()){
            list.set(list.size() - 1,"The size of the list is " + list.size());
        }
        
        list.add("last");
        list.set(0, "first");
        return list;
    }
    
}