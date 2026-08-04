//package sprint;

public class GCDRecursive {
    public static int gcd(int a, int b){
       

        if (b == 0){
            return Math.abs(a);
        }
        
        int temp = a % b;
        a = b;
        b = temp;



        return (gcd(a, b));
    }
}