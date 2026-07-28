public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = ArrayAdder.concatArrays(arr1, arr2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}