package ArraysPackage;

import java.util.Arrays;

public class InsertElementInArray {
    public static void main(String[] args) {
        int arr[]  = {12,1,4,5,1,2,11,14};
        int element =50;
        int position = 3;

        int[] newArray1 = insertElement(arr,element,position);

        System.out.println("New Array: " + Arrays.toString(newArray1));
    }

    public static int[] insertElement (int[] arr, int element, int position) {

        //create new array with one extra size
        int [] newArray = new int[arr.length+1];

        //insert element as it is upto given position (< position)
        for (int i = 0; i< position ;i++) {
            newArray[i] = arr[i];
        }


        //insert given element at given index
        newArray[position] = element;

        // insert remaining element of original array after given position
        for (int i = position; i<arr.length;i++) {
            newArray[i+1] = arr[i];
        }

        return newArray;

    }
}
