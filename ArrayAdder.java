//package sprint;



public class ArrayAdder {
    public static int[] concatArrays(int[] arr1, int[] arr2) {
        int[] con = new int [arr1.length + arr2.length];
        int n = arr1.length;
        int m = arr2.length;
        
        System.arraycopy(arr1, 0, con, 0, n);

        System.arraycopy(arr2, 0, con, n, m);

        return con;
    }
}