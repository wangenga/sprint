package sprint;

public class ArrayInitializer {
    public int[] fillArray(int max) {

        int [] x = new int [max];
        int result = 1;

        if ( max < 1){
            return;
        }else {
          for (int i = 0; i < x.length; i ++){
            x [i] = result++;
        }  
        }

        return x;     
    }
}