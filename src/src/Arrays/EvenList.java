package Arrays;

public class EvenList {
    public static void main(String[] args) {
        int[] a = {12,4,2,1,53,64,14,54,33};

        System.out.println("Even numbers in the array: ");
        for (int num : a) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
