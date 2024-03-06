//Q5: Write a function which accepts a 2D array of integers and its size as arguments and
//        displays the elements of middle row and the elements of middle column. Printing can
//        be done in any order.
//        [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

import java.util.Scanner;

public class Q5 {
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

        for (int i = 0; i<r; i++){
            for (int j = 0; j<c; j++){
                if (i == r/2 || j == c/2 ){
                    System.out.print(array[i][j] + " ");
                }

            }

        }
    }
}
