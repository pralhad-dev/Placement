package ArraysPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(10);
        arr.add(15);


            System.out.println("Array List:" +arr);


        arr.remove(0);

        for (int num: arr) {
            System.out.println("After Removing List:" +num);
        }


    }
}
