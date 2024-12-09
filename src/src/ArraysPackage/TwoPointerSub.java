package ArraysPackage;

public class TwoPointerSub {

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7,8,9};
        int target = 5;

        findPairs(arr,target);
    }
    public static void findPairs(int[] arr, int target) {
      int left = 0;
      int right = 1;

      while (right < arr.length) {
          int diff = arr[right]-arr[left];

          if(diff == target) {
              System.out.println("found pair");
              break;
          } else if (diff<target) {
              right++;
          } else {
              left++;
          }
      }
    }


}
