//Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
//        Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
//Output 1: 6
//Input 2: arr = [ 0 0 0 0 0 1 1]
//Output 2: 2


public class Q3 {

    public static void countTotal1sInAnArray(int[] array){

        int count = 0;
        for(int i = array.length-1; i>=0; i--){
            if (array[i] == 1 ){
                count++;
            }else {
                break;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        int[] array = {0,0,0,0,0,1,1,1,1,1,1,1};
        countTotal1sInAnArray(array);

    }
}
