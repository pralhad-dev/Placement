package TwoPointerApproach;

public class RemoveDuplicatesElement {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = removeDuplicates(nums);

        System.out.println("Length of the modified array: " + length);
        System.out.println("Modified array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0;
        for (int i =1 ;i< nums.length;i++) {
            if (nums[i] != nums[slow]) {
                slow++;
                nums[slow] =nums[i];
            }
        }
        return slow+1;
    }
}
