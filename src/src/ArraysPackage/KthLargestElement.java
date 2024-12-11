package ArraysPackage;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {12,3,55,14,10,35,19};
        int k = 4;

        int largest = FindLargest(arr,k);

        System.out.println("Kth Largest Element: "+largest);
    }

    private static int FindLargest(int[] arr,int k) {
        Arrays.sort(arr);

        return arr[arr.length-k];
    }
}
