package TwoPointerApproach;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 8;

        boolean result = pairWithSum(arr,target);

        System.out.println("is there any pair ?:"+ result);

    }

    private static boolean pairWithSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length-1;

        while (left<right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum<target) {
                left++;
            } else {
                right --;
            }
        }

        return false;
    }

}
