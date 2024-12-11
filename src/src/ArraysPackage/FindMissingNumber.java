package ArraysPackage;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7,9,15};

        int missingValue = missingNumber(arr);

        System.out.println("Missing Number:"+ missingValue);
    }

    private static int missingNumber(int[] arr) {

        int n = arr.length+1;

        int expectedSum  = n * (n+1) /2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum+=num;
        }

        return expectedSum - actualSum;
    }

}
