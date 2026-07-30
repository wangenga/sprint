//package sprint;

import java.util.List;
import java.util.ArrayList;

public class PrimeFinder {
    public static List<Integer>  findPrimesUpTo(int x){
        
      List<Integer> intList = new ArrayList<>();

      for (int i = 2; i <= x; i++){
        if (isPrime(i)){
            intList.add(i);
        }
      }
      return intList;
    }

    private static boolean isPrime(int num){
        if (num < 2){
            return false;
        }

        for (int n = 2; n * n <= num ; n++ ){
            if (num % n == 0 ){
                return false;
            };
        }
        return true;
    }

    
}
