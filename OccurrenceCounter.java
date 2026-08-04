//package sprint;

public class OccurrenceCounter {
    public int countOccurrences(int[] arr, int element, int index){
        int count = 0;

        if(arr == null || arr.length == 0 || index > arr.length - 1 || index < 0){
            return 0;
        }{
            return recurCount( arr, element, index, count);
        }
    }

    private int recurCount(int[] arr, int element, int index, int count){

        if (index <= arr.length - 1 ){
            if (arr[index] == element){
                count = count + 1;
            }
            return recurCount(arr, element, index + 1, count );
        }

        return count;
    }
}