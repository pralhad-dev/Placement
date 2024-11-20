package Arrays;

public class OddList {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,7,8,9,10};

        for (int i :a){
            if (i%2 !=0){
                System.out.println("Odd List: "+ i);

            }
        }
    }
}
