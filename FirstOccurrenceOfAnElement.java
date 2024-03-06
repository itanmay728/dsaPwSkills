
import java.util.Scanner;

public class FirstOccurrenceOfAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " numbers of element for an array");
        int[] array = new int[size];

        for (int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the number that you want to find");
        int target = sc.nextInt();

//        System.out.println("Entered array is : ");
//        for (int i = 0; i<size; i++){
//            System.out.print(array[i] + " ");
//        }

        //using binary search algorithm
        int low = 0;
        int high = size-1;
        int result = -1;
        while (low<high){
            int mid = low + (high-low)/2;
            if (array[mid] == target){
                result = mid;
                high = mid--;
            }else if (array[mid] > target){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }

        System.out.println(result);
    }
}
