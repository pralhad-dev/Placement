package ArraysPackage;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {10,2,1,42,14,142,2};

        int max = arr[0];

        for (int i = 0; i< arr.length;i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("MAX Element : " +max);

    }
}
