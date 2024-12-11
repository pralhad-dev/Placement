package ArraysPackage;

public class LargestAndSmallestElement {

    public static void main(String[] args) {
        int [] arr = {20,12,4,1,111,2,6};

        int largestElement = findLargestElement (arr);
        int smallestElement = findSmallest(arr);
        System.out.println("Largest Element:" +largestElement);
        System.out.println("Smallest Element:" +smallestElement);
    }

    private static int findLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    private static int findSmallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;

        for (int num :arr) {
            if (num <smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
}
