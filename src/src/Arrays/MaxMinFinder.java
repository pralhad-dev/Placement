package Arrays;

public class MaxMinFinder {

    public static int setMini(int [] A, int N){

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i<N; i++){
            if (A[i]<mini) {
                mini = A[i];
            }
        }
        return mini;
    }

    public static int setMaxi(int[] A, int N) {
        int maxi = Integer.MIN_VALUE;
        for (int i=0; i<N; i++){
            if (A[i] > maxi) {
                maxi = A[i];
            }
        }
        return maxi;
    }

    public static void main (String[] args) {
        int[] A = {2,1,4,5,1,2,1,4,5,12};
        int N = A.length;
        System.out.println("Min elemet:"+ setMini(A,N));
        System.out.println("Max element:"+ setMaxi(A,N));
    }

}
