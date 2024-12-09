package ArraysPackage;

import java.util.Arrays;

public class InsertElementInSortedArray {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {10, 20, 30, 40, 50};
        int element = 25;

        int[] newArr = insertElementAtSortedArray(arr, element);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("After Insertion: " + Arrays.toString(newArr));
    }

    private static int[] insertElementAtSortedArray(int[] arr, int element) {
        // Create a new array with additional space
        int[] newArr = new int[arr.length + 1];

        // Copy all elements from the original array
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element at the end
        newArr[arr.length] = element;

        // Sort the array to maintain sorted order
        Arrays.sort(newArr);

        return newArr;
    }
}
