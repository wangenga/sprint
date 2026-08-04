//package sprint;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String x, String y){
        if (x.length() != y.length()) return false;

        char[] x1 = x.toLowerCase().toCharArray();
        char[] y1 = y.toLowerCase().toCharArray();

        Arrays.sort(x1);
        Arrays.sort(y1);
        return Arrays.equals(x1, y1);

    }
    
}
