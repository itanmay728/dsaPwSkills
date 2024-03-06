//Q2: write a program to print the elements above the secondary diagonal in a user inputted
//        square matrix.
//input=  1 2 3
//        4 5 6
//        7 8 9
//output = 1 2 4 ;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        for (int i = 0; i<r; i++){
            for (int j = 0; j<c; j++){
                if (i+j<r-1) System.out.print(array[i][j] + " ");
            }
        }
    }
}
