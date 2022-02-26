import java.util.ArrayList;

public class nomor6 {
    public static void main(String[] args) {
    //String[] nama = {"A","L","D","I"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("A");
    nama.add("L");
    nama.add("D");
    nama.add("I");
    

    nama.add(0,"e");
    System.out.println("setelah menambahkan string e " + nama);

    nama.add(2,"f");
    System.out.println("setelah menambahkan string f " + nama);

    nama.add(3,"g");
    System.out.println("setelah menambahkan string g " + nama);

    nama.add(4,"h");
    System.out.println("setelah menambahkan string h " + nama);

    nama.add(6,"h");
    System.out.println("setelah menambahkan string h " + nama);

    nama.add(-3,"j");
    System.out.println("setelah menambahkan string j " + nama);

   

            
    }
}