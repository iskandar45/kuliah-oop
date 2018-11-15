public class Buku {
    // variabel
    String judul ;
    String pengarang ;
    String penerbit ;
    int tahun ;

    // ini konstruktor 
    public Buku(String judul,String pengarang, String penerbit, int tahun) {
        this.judul = judul ;
        this.pengarang = pengarang ;
        this.penerbit = penerbit ;
        this.tahun = tahun ;
    }

    // ini method 
    void cetakBuku() {
        System.out.println("Judul Buku  = " +judul);
        System.out.println("Pengarang   = " +pengarang);
        System.out.println("Penerbit    = " +penerbit);
        System.out.println("Tahun       = " +tahun);
    }

    // program utama
    public static void main(String [] skraahh) {
        // membuat objek dari konstruktor Buku dan memberikan nilai         
        Buku book = new Buku("Dasar Pemrograman JAVA","Abdul Kadir","Andi Offset",2006);
        // memanggil method dengan objek dari konstruktor
        book.cetakBuku();
    }
}