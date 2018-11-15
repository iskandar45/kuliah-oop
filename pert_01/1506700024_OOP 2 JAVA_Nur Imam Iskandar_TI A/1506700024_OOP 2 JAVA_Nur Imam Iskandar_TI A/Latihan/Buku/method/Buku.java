public class Buku {
    // ini variable
    String judul ;
    String pengarang ;
    String penerbit ;
    int tahun ;
    // ini method
    void cetakBuku() {
        System.out.println("Judul Buku      = "+judul);
        System.out.println("Pengarang       = "+pengarang);
        System.out.println("Penerbit        = "+penerbit);
        System.out.println("Tahun           = "+tahun);
    }
    // ini main nya
    public static void main(String skraahh []) {
        //membuat objek dari method cetakBuku()
        Buku ctk = new Buku();
        // memberi nilai pada objek
        ctk.judul = "Pemrograman OOP dengan JAVA";
        ctk.pengarang = "Indrajani";
        ctk.penerbit =  "Elexmedia Komputindo";
        ctk.tahun = 2007;
        // memanggil method
        ctk.cetakBuku();
    }
}