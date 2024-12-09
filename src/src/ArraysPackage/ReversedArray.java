package ArraysPackage;

public class ReversedArray  {
    public static void main(String[] args){
        int[] a1 = {12,124,13,1,5,3,11};
        reverseArray(a1);

        for (int num : a1) {
            System.out.print (num+" ");
        }
        
    }
    
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;


        }
    }
}
