package ArraysPackage;

public class SimpleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        for (int i=0; i<arr.length;i++){
            System.out.println("Given Array:"+arr[i]);
        }

        // update any value

        arr[4] =100;

        for (int i =0 ;i<arr.length;i++){
            System.out.println("Updated Array: " +arr[i]);
        }
    }
}
