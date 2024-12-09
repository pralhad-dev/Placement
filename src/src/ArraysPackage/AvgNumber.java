package ArraysPackage;

public class AvgNumber {

    public static void main (String args[]) {
        int[] arr = {10,20,30,50};
        int sum =0;

        //print array
        for (int i=0 ;i<arr.length;i++) {
            System.out.println("Given array:"+arr[i]);
            sum += arr[i];
        }

        // calculate
        double avg = sum/arr.length;

        System.out.println("Average:" +avg);


    }
}
