package ArraysPackage;

import java.util.Arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int [] array = {12,13,1,4,5,1,2};
        int[] sortedArray = {1,2,4,5,6,7};

        System.out.println(" Is Sorted Array:"+ checkSorted(array));
        System.out.println("Is Sorted array:" + checkSorted(sortedArray));

    }

    private static Boolean checkSorted(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
