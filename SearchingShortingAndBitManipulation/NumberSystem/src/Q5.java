import java.util.Scanner;

//Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even
//number of times except one which appears an odd number of times. Find that odd appearing
//element in linear time and without using any extra memory.
//For example,
//Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
//Output : The odd occurring element is 4.
public class Q5 {

    public static void countingOddNumber(int[] array){

        int count =0;
        for (int i = 0; i<array.length; i++){
            if (array[i] %2 != 0){
                count++;
            }
        }

        System.out.println(count);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size");

        int size = sc.nextInt();
        int [] array = new int[size];

        for (int i = 0 ; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        countingOddNumber(array);
    }
}
