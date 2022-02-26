import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) {
    //String[] nama = {"A","L","D","I"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("A");
    nama.add("L");
    nama.add("D");
    nama.add("I");
    

    System.out.println("ArrayList sebelum remove:");
    for(String var: nama){
         System.out.println(var);
    }

    // System.out.println(nama.remove(0));
    // System.out.println(nama.remove(3));
    // System.out.println(nama.remove(2));

    //nama.remove(0);
    //nama.remove(3);
    nama.remove(2);
    System.out.println("ArrayList setelah remove(2):");
       for(String var2: nama){
             System.out.println(var2);

            }
    }
}