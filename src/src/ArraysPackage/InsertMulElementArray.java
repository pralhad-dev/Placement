package ArraysPackage;

import java.util.Arrays;

public class InsertMulElementArray {
    public static void main(String[] args) {
        int [] arr = {12,41,15,5,1,5,66,123};
        int[] element = {0,10};
        int position = 2;

        int[] newArray = insertMulElement(arr,element,position);

        System.out.println("Old array:"+ Arrays.toString(arr));
        System.out.println("New Array:"+Arrays.toString(newArray));


    }

    public static int[] insertMulElement(int [] arr, int[] element, int position) {

        //create new array
        int[] newMulArray = new int[arr.length+element.length];

        // copy all element from given array to new upto given position
        for (int i = 0 ; i<position;i++) {
            newMulArray[i] = arr[i];
        }
        //insert element at given postion
        for (int ele:element) {
            newMulArray[position+1] = ele;
        }

        //insert remaining element at end
        for (int i = position ;i < arr.length ;i ++) {
            newMulArray[element.length+i] = arr[i];
        }

        return newMulArray;


    }

}
