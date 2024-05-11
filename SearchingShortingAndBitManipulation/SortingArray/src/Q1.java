//Q1. Write a program to sort an array in descending order using bubble sort.
//Input Array {3,5,1,6,0}
//Output Array: {6, 5, 3, 1, 0}
public class Q1 {

    //sorting by bubble sort
    public static void sortArrayByBubbleSort(int[] array){

        for (int i = 0 ; i < array.length; i++){
            boolean swap = false;
            for (int j = 0 ; j< array.length-i-1; j++){
                if (array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swap = true;
                }
            }

            if(!swap){
                break;
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {

        int [] array = {3,5,1,6,0};
        sortArrayByBubbleSort(array);
    }
}
