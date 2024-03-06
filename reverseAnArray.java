public class reverseAnArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        //Direct printing reversed array
        for (int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] +" ");
        }


//        //By swaping
//        for (int i  = 0 ; i< arr.length/2; i++){
//            int temp = 0;
//            temp = arr[i];
//
//            arr[i] = arr[arr.length-i-1];
//
//            arr[arr.length-i-1] = temp;
//
//        }
//
//        System.out.println();
//        System.out.println("reversed array  is ");
//
//        for (int i = 0; i< arr.length; i++){
//            System.out.print(arr[i] +" ");
//        }

        System.out.println();
        System.out.println("second method");

        int[] array = new int[arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0; i--){
            array[k] = arr[i];
            k++;
        }

        for (int i = 0 ; i<array.length; i++){
            System.out.print(array[i] + " ");
        }


    }
}
