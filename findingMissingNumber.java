public class findingMissingNumber {
    public static void main(String[] args) {

        int [] arr = {1,2,4,5,6,7};

        int sumOfNaturalNumber = ((arr.length+1)*(arr.length+2))/2;
        int sumOfArray = 0;
        for (int i = 0; i<arr.length; i++){
            sumOfArray = sumOfArray + arr[i];
        }

        int ans = sumOfNaturalNumber - sumOfArray;
        System.out.println("Missing number is: " + ans);
    }
}
