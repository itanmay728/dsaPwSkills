//Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than its just left and just right neighbor.
//        Input 1: arr[ ] = {1,3,2,6,5}
//        Output 1: 6

public class Q5 {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i< array.length; i++){
            if (array[i] > largestNumber){
                largestNumber = array[i];
            }
        }
        System.out.println(largestNumber);
    }
}
