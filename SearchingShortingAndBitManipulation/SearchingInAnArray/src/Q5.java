//Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
//A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer
//with itself.
//Example 1:
//Input: num = 16
//Output: true
//Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
//        Example 2:
//Input: num = 14
//Output: false
//Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

public class Q5 {

    public static boolean perfectSquare(int num){

        long start = 0;
        long end = num/2;

        while (start <= end){

            long mid = start + (end - start)/2;

            if (mid*mid < num){
                start = mid+1;
            }else if (mid*mid > num){
                end = mid-1;
            }else return true;

        }

        return false;


    }

    public static void main(String[] args) {

        System.out.println(perfectSquare(15));


    }
}
