package sprint;

import java.util.List;
import java.util.NoSuchElementException;
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

        if (!hasNext()){
            throw new NoSuchElementException("No more elements in the list");
        }

        return numbers.get(cindex++);
    }
}