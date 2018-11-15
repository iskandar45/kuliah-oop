public class tesBuku {
    // variabel book dengan array
    String[] book = {
        "Pemrograman Berbasis Objek dengan Java, Indrajani, Elexmedia Komputindo, 2007",
        "Dasar Pemrograman Java, Abdul Kadir, Andi Offset, 2006"
    }; 
    // ini methodnya
    void ctkBuku() {
        System.out.println("Buku Pertama    : "+book[0]);
        System.out.println("Buku Kedua      : "+book[1]);
    }
    // ini main program nya
    public static void main(String [] skraahh) {
        // membuat objek ctk dari method ctkBuku()
        tesBuku ctk = new tesBuku();
        // memanggil method ctkBuku() dengan objek ctk
        ctk.ctkBuku();
    }
}