import java.util.ArrayList;

public class nomor3 {
    public static void main(String[] args) {
        //String[] nama= {"A", "L", "D", "I"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("L");
        nama.add("D");
        nama.add("I");

        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));
    }

    
}