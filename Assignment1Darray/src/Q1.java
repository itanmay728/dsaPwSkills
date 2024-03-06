// Write a program to print the sum of all the elements present on even indices in the given array.
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers for an array");
        int [] arr = new int[n];
        for (int i = 0 ; i<n;  i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            if (i%2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("Sum of all even index element is "+ sum);
        //3,20,4,6,9
    }
}
