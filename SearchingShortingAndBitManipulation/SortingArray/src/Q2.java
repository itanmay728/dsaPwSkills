//Q2. WAP to sort an array in descending order using selection sort
//Input Array {3,5,1,6,0}
//Output Array: {6, 5, 3, 1, 0}

import java.util.Scanner;

public class Q2 {

    public static void arraySortingBySelectionSort(int[] array){

        for (int i =0 ; i< array.length; i++){

            int min_index = i;
            for(int j = i+1; j< array.length; j++){

                if(array[j] > array[min_index]){

                    min_index = j;
                }

            }

            if(min_index!= i){

                int temp = array[min_index];

                array[min_index] = array[i];
                array[i] = temp;
            }
        }

        for (int i = 0; i<array.length; i++){
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

        arraySortingBySelectionSort(array);
    }
}
