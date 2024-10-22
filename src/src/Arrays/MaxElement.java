package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,4,1,2,45,66,11,3,512,12,53};
        int max = arr[0];

        for (int i= 0; i<arr.length;i++){
           if (arr[i] >max) {
               max = arr[i];
           }
        }
        System.out.println(max);
    }
}
