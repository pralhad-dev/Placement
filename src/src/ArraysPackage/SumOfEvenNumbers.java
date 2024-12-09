package ArraysPackage;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,8};
        int sum = 0;

        for (int i : arr){
            if (i%2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum:"+sum);
    }

}
