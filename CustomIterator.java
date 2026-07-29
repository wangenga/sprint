package sprint;

import java.util.List;
import java.util.Iterator;

public class CustomIterator implements Iterator<Integer> {
    private List<Integer> numbers;
    private int cindex;

    public CustomIterator(List<Integer> inputnum) {
        this.numbers = inputnum;
        this.cindex = 0;
    }

    @Override
    public boolean hasNext(){
        
        return cindex < numbers.size();
        

    }

    @Override
    public Integer next(){
        return numbers.get(cindex++);
    }
}