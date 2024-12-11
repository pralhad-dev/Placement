package ArraysPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMultipleElement {
    public static void main(String[] args) {
       int [] arr = {12,14,21,55,1,23,51,12};

        Arrays.sort(arr);

        List<Integer> missingValues = findMissingElement (arr);

        System.out.println("Missing element :" +missingValues);
    }

    public static List<Integer> findMissingElement (int[] arr) {

        List<Integer> missingList = new ArrayList<>();

        for (int i = 0;i<arr.length-1;i++) {
            int left = arr[i];
            int right = arr[i+1];

            for (int j = left+1; j<right; j++ ) {
                    missingList.add(j);
            }
        }
        return missingList;
    }
}
