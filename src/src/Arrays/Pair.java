package Arrays;

import java.util.Arrays;

 class Pair {
    public int min;
    public int max;

}
class Main {
     static Pair getMinMax(int[] arr, int n){
        Pair minMax = new Pair();
        Arrays.sort(arr);
        minMax.min = arr[0];
        minMax.max = arr[n-1];
        return minMax;
    }

    public static void main (String[] args) {
        int arr[] = {4,12,4,1,21,4,2};
        int length = arr.length;
        Pair minmax = getMinMax(arr,length);
        System.out.println("Min: "+minmax.min);
        System.out.println("Max:" + minmax.max);

    }
}
