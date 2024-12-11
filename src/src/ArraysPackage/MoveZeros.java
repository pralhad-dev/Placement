package ArraysPackage;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,3,0,4};

         movingZeros(arr);
         printArray(arr);
    }

    public static void movingZeros(int[] arr) {
        int count = 0;

        for (int i =0 ;i<arr.length;i++) {
            if (arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;

                count++;

            }
        }

    }
    public static void printArray(int[] arr) {
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
