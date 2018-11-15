public class Buku {
    //variabel
    String judul ;
    String pengarang ;
    String penerbit ;
    int tahun ;
    
    //ini constructor
    public Buku(String judul,String pengarang,String penerbit,int tahun) {
        this.judul = judul ;
        this.pengarang = pengarang ;
        this.penerbit = penerbit ;
        this.tahun = tahun ;
        System.out.println("Judul Buku      = " +judul);
        System.out.println("Pengarang       = " +pengarang);
        System.out.println("Penerbit        = " +penerbit);
        System.out.println("Tahun           = " +tahun);
    }

    // ini main nya
        public static void main(String[] skraahh) {
            Buku book = new Buku("Pemrograman OOP dengan JAVA","Indrajani","Elexmedia Komputindo",2007);
        }
     
}