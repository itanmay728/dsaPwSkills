//Q4. Given a number, count the number of set bits in that number without using an extra space.
//Note : bit ‘1’ is also known as set bit.
public class Q4 {

    public static void count(int n){

        int count = 0;
        while (n>0){
            count += n&1;
            n >>= 1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {

        count(5);
    }
}
