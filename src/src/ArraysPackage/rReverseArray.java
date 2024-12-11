package ArraysPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Before Reverse:"+ Arrays.toString(arr));

        int[] revArr = reverseArrayUsingTwoPointer(arr);
        System.out.println("After Reverse:"+Arrays.toString(revArr));
    }

    private static int[] reverseArrayUsingTwoPointer(int[] arr) {
        int left = 0;
        int right = arr.length-1;


        while(left<right) {

           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;

           left ++;

           right --;
        }
        return arr;
    }
}
