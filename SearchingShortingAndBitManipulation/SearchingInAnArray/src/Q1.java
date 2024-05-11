//Given an array. FInd the number X in the array. If the element is present, return the index of the element,
//else print “Element not found in array”. Input the size of array, array from user and the element X from user.
//Use Linear Search to find the element.

import java.util.Scanner;

public class Q1 {

    public void indexOfSearchedElement(int[] arr, int a){

        int index = -1;
        for (int i = 0; i< arr.length; i++){
            if (a == arr[i]){
                index = i;
                break;
            }
        }
        if (index != -1){
            System.out.println("Index of Searched element is "+ index);
        }else {
            System.out.println("Element not found in array");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int index = sc.nextInt();

        int [] array = new int[index];

        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find in the given array");
        int number = sc.nextInt();
        Q1 obj = new Q1();
        obj.indexOfSearchedElement(array, number);

    }
}
