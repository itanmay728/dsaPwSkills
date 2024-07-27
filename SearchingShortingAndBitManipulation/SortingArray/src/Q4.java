//Q4. Find out how many pass would be required to sort the following array in decreasing order
//using bubble sort
//Input Array {3,5,1,6,0}

import java.util.Scanner;

public class Q4 {

    public static void sortingArrayByBobbleSort(int[] array){

        for (int i = 0 ; i<array.length;i++){
            for (int j = i+1; j<array.length;j++){
                if (array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
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

        sortingArrayByBobbleSort(array);
    }
}
