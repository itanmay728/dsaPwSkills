//Q3: Write a program to calculate the maximum element in the array.
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers for an array");

        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int value : arr){
            max = Math.max(max , value);
        }

        System.out.println(max);

    }
}
