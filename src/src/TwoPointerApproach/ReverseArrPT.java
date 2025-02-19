package TwoPointerApproach;

public class ReverseArrPT {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};

        reverseArrayUsingTp(arr);

        System.out.println("After Reverse");
        printArray(arr);
    }

    public static void reverseArrayUsingTp(int[] arr) {
        int left =0;
        int right = arr.length-1;

        while (left<right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
