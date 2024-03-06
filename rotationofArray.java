import java.util.Scanner;

public class rotationofArray {

    static int[][] transpose(int[][] arr , int r , int c){

        for (int i = 0 ; i<r; i++){
            for (int j = i; j<c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    static void Swap(int[] arr){

        int x = 0;
        int y = arr.length-1;

        while (x<y){
            arr[x] =  arr[x] + arr[y];
            arr[y] = arr[x] - arr[y];
            arr[x] = arr[x] - arr[y];
            x++;
            y--;
        }
    }
    static void rowSwap(int[][] arr){
        for (int i = 0; i<arr.length; i++){
            Swap(arr[i]);
        }

        for (int i = 0; i< arr.length;i++){
            for (int j= 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row size");
        int r = sc.nextInt();
        System.out.println("Enter colum size");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        System.out.println("Enter "+ r*c + "numbers for an array");
        for (int i = 0 ; i<r; i++){
            for (int j = 0; j<c; j++){
                array[i][j] = sc.nextInt();
            }
        }

        int [][] transArray = transpose(array, r, c);
        rowSwap(transArray);





    }
}
