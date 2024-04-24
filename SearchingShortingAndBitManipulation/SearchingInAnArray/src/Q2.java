//Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
//not present return -1.
//Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
//Output 1: 6
//Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
//Output 2: -1
public class Q2 {

    public static void lastOccurrence(int[] array, int num){

        int lastOccurrence =0;
        for(int i = 0; i<array.length; i++){
            if (num == array[i]){
                lastOccurrence = i;
            }
        }

        System.out.println(lastOccurrence);
    }

    //if array is shorted
    public static void lastOccurrenceIfArrayIsShorted(int[] array, int target){

        int high = array.length-1;
        int low = 0;

        while (low <= high){

            if ()

        }
    }
    public static void main(String[] args) {

        int[] arr = {1 ,1 ,1, 2 ,3 ,4 ,4 ,5 ,6 ,6 ,6, 6};
       int  target = 4;

        lastOccurrence(arr, target);

    }
}
