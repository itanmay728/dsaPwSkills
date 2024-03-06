//Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
//
//        number of positive numbers
//        number of negative numbers
//        number of odd numbers
//        number of even numbers
//        number of 0.
//
//        Input 1:
//
//        1 2 -3 4
//        0 0 -4 2
//        1 -1 2 3
//        -4 -5 -7 0
//
//        Output :
//        number of positive numbers = 7
//        number of negative numbers = 6
//        number of odd numbers = 7
//        number of even numbers = 9
//        number of 0 = 3

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size");
        int r = sc.nextInt();
        System.out.println("Enter colum size");
        int c = sc.nextInt();
        System.out.println("Enter "+ r*c + " numbers for an array");
        int[][] array = new int[r][c];

        for (int i = 0 ; i<r; i++){
            for (int j = 0; j<c; j++){
                array[i][j] = sc.nextInt();
            }
        }
        int positive, negative, odd, even, zero;
        positive = negative = odd = even = zero = 0;
        for (int i = 0; i<r; i++){
            for (int j = 0 ; j<c; j++){
                if (0 > array[i][j]){
                    negative++;
                }if (0 < array[i][j]){
                    positive++;
                }if (array[i][j]%2 != 0){
                    odd++;
                }if (array[i][j]%2 == 0){
                    even++;
                }if (array[i][j] == 0){
                    zero++;
                }
            }
        }

        System.out.println("number of positive numbers "+ positive);
        System.out.println("number of negative numbers "+ negative);
        System.out.println("number of odd numbers "+ odd);
        System.out.println("number of even numbers "+ even);
        System.out.println("number of 0 "+ zero);

    }
}
