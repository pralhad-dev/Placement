package ArraysPackage;

import java.util.Arrays;

public class MissingInArrayWithRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n =8;

        Arrays.sort(arr);
        int missingElement = findMissingElements(arr,n);
        System.out.println("Missing Element: "+ missingElement);
    }
    public static int findMissingElements(int[] a, int n) {

        int expectedSum = n * (n+1) /2;

        int actualSum = 0;
        for (int num : a) {
            actualSum +=num;
        }

        return expectedSum-actualSum;
    }
}
