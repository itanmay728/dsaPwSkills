//Q4: Write a program to find out the second largest element in a given array.
public class Q4 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0 ; i< array.length; i++){
            if (array[i] > largestNumber){
                largestNumber = array[i];
            }
        }

        for (int i = 0; i<array.length; i++) {
            if (array[i] == largestNumber){
                array[i] = Integer.MIN_VALUE;
            }
        }

        int secondLargestNumber = Integer.MIN_VALUE;

        for (int i = 0; i<array.length; i++){
            if (array[i] > secondLargestNumber){
                secondLargestNumber = array[i];
            }
        }

        System.out.println(secondLargestNumber);
    }
}