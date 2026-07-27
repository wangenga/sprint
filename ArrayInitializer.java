package sprint;

public class ArrayInitializer {
    public int[] fillArray(int max) {

        if ( max < 1){
            return new int [0];
        }

        int [] x = new int [max];
        int result = 1;

        for (int i = 0; i < x.length; i ++){
            x [i] = result++;
        }
        
        return x;     
    }
}