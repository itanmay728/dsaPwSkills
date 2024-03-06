//Q2: Write a program to traverse over the elements of the array using for each loop and print all even

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers for an array");
        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<n; i++){
            if (arr[i]%2 == 0){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
