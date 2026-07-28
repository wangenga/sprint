public class Main {

    public static void main(String[] args) {
        ArraySorter sorter = new ArraySorter();
        double[] unsorted = {5.5, 2.2, 8.8, 1.1, 3.3};
        double[] sorted = sorter.sortArray(unsorted);
        for (double num : sorted) {
            System.out.print(num + " ");
        }
    }
}