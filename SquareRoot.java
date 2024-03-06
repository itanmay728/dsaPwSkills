import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int number = sc.nextInt();
        int [] array = new int[number];
        for (int i = 0 ; i<number; i++){
            array[i] = i+1;
        }

        for (int i = 0; i<number; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int low = 0;
        int high = number;
        boolean flag = false;
        while(low <= high){
            int mid = low + (high-low)/2;
            if (array[mid]*array[mid] == number){
                System.out.println("The square root of " + number + " is " + array[mid]);
                flag = true;
                break;
            } else if (array[mid]*array[mid] < number) {
                low = mid+1;
            } else if (array[mid]*array[mid] > number) {
                high = mid-1;
            }
        }

        if (flag == false){
            System.out.println("no square root for this number");
        }
    }
}
