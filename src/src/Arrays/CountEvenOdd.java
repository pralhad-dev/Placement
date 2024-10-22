package Arrays;

public class CountEvenOdd {

    public static void main(String[] args) {
        int[] arr = {10,11,2,34,23,11,0,42,33};

        int evenNum=0;
        int oddNum =0;

        for (int arr1:arr){

            if (arr1 % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }

        System.out.println("Even List:"+evenNum);
        System.out.println("Odd List:"+oddNum);
    }
}
