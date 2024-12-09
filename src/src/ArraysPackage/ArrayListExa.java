package ArraysPackage;

import java.util.ArrayList;

public class ArrayListExa {
    public static void main(String[] args) {

        ArrayList<String> arrayList =new  ArrayList<>();

        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Lemon");
        arrayList.add("Mango");

        for (String fruit: arrayList) {
            System.out.println(fruit);
        }

        //update value at 2nd index
        arrayList.add(2,"Orange");
        System.out.println(arrayList.get(2));

        //remove value from 3 index
        arrayList.remove("Mango");
        System.out.println(arrayList.get(3));

        int length = arrayList.size();
        System.out.println("Length"+length);
    }
}
