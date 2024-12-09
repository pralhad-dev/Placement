package ArraysPackage;

public class TwoPointer {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,8};
        int target = 1;

        findPair(arr,target);

    }
    public static void findPair(int[] arr,int target) {
        int left = 0;
        int right = arr.length-1;

        while (left<right) {
             int sum = arr[left]-arr[right];

             if (sum == target){
                 System.out.println("Found Pair("+arr[left]+","+arr[right]+")");
                 break;
             } else if (sum < target) {
                 left++;
             } else {
                 right--;
             }
            System.out.println("No Pair Found");

        }
    }
}

