package TwoPointerApproach;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target =9;

        int[] result = twoSum(arr,target);

        System.out.println("Result:"+result[0]+","+result[1]);

    }

    private static int[] twoSum(int[] arr, int target) {

        int left = 0, right =arr.length-1;

        while (left<target) {
            int sum = arr[left]+arr[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based index
            } else if (sum<target){
                left++;
            } else {
                right++;
            }
        }
        return new int[]{-1,1};
    }

}
