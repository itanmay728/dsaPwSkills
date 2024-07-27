//Q3. WAP to sort an array in decreasing order using insertion sort
//Input Array {3,5,1,6,0}
//Output Array: {6, 5, 3, 1, 0}

import java.util.Scanner;

public class Q3 {

    public static void sortingArrayByInsertionSort(int[] array){

        for (int i = 0 ; i< array.length; i++){
            int j = i;
            while (j>0 && array[j] > array[j-1]){

                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }

        for (int i = 0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0 ; i<size; i++){

            array[i] = sc.nextInt();

        }

        sortingArrayByInsertionSort(array);
    }
}
