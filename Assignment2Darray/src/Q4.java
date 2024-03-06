//Q4: Write a program to find the largest element of a given 2D array of integers.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter row size");
        int r = sc.nextInt();
        System.out.println("Enter colum size");
        int c = sc.nextInt();
        System.out.println("Enter " + r*c +" numbers of elements");
        int[][] array = new int[r][c];

        for (int i = 0 ; i<r ; i++){
            for (int j = 0; j<c; j++){
                array[i][j] = sc.nextInt();
            }
        }

        int largestElement = Integer.MIN_VALUE;

        for (int i = 0; i<r; i++){
            for (int j = 0; j<c; j++){
                if (array[i][j] > largestElement){
                    largestElement = array[i][j];
                }
            }
        }

        System.out.println(largestElement);
    }
}
