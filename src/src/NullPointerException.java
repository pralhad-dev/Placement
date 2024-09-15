public class NullPointerException {
    public static void main(String[] args) {
        Data d = new Data();


        if(d.items !=null) {
            System.out.println(d.items.length);
        } else {
            System.out.println("Items is null");
        }

    }
}
class Data {
    String[] items;
}
