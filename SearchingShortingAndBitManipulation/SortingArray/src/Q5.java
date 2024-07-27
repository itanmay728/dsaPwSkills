import java.util.Scanner;

//Q5. Find out the number of iterations to sort the array in descending order using selection sort.
//Input Array {3,5,1,6,0}
public class Q5 {

    public static void sortingArrayBySelectionSort(int[] array){

        for (int i = 0; i<array.length; i++){
            int min_index = i;

            for (int j = i+1; j<array.length; j++){

                if (array[j] > array[min_index]){
                    min_index = j;
                }
            }

            if (min_index!= i){

                int temp = array[i];
                array[i] = array[min_index];
                array[min_index] = temp;
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
        sortingArrayBySelectionSort(array);

    }
}
