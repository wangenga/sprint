public class Main {

    public static void main(String[] args) {
        OccurrenceCounter counter = new OccurrenceCounter();
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        System.out.println(counter.countOccurrences(arr, 2, 0));
        System.out.println(counter.countOccurrences(arr, 6, 0));
        System.out.println(counter.countOccurrences(null, 1, 0));
        System.out.println(counter.countOccurrences(new int[]{}, 1, 0));
    }

}