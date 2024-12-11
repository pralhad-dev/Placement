package ArraysPackage;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int [] arr = {10,20,5,3,25};

        int secondLargest = secondLargestElemet(arr);

        System.out.println("Second largest Element:" + secondLargest);
    }

    private static int secondLargestElemet(int[] arr) {
        if (arr.length<2) {
            throw new RuntimeException("array must have atleast 2 distinct element");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest  = Integer.MIN_VALUE;

        for (int num :arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest){
                secondLargest = num;

            }
        }
        return secondLargest;
    }
}
