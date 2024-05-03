import java.util.Scanner;

//Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
//is not found in the array, report that as well.
//        Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
//target = 5
//Output: Target 5 occurs 3 times
//Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
//target = 6
//Output: Target 6 occurs 2 times
public class Q4 {

    public static void countAccurrences(int[] array,  int target){

        int count = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i] == target){
                count++;
            }
        }

        if (count == 0){
            System.out.println("the value you trying to find is not present in this array");
        }else {
            System.out.println("target " + target +  " occurs " + count + " times");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int [] array = new int[size];

        System.out.println("Enter array");
        for (int i = 0 ; i< array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("enter target value");
        int target = sc.nextInt();
        countAccurrences(array, target);


    }
}
