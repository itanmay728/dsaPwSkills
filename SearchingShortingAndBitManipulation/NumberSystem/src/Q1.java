import java.util.Scanner;

//Problem 1: given a number, print its binary representation. [easy]
//Input 1: number = 5
//Output 1: 101
//Input 2: number = 10
//Output 2: 1010
public class Q1 {


    public static void findingBinaryToDecimal(int num){

        int ans = 0;
        int power = 1;

        while (num > 0){

            int a = num%10;
            ans = (power*a)+ans;

            num/=10;
            power*=2;

        }

        System.out.println(ans);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        findingBinaryToDecimal(num);
    }
}
