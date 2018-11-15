public class konstruktorMhs {
    int npm ;
    String nama, prodi ;

    public konstruktorMhs (int npm, String nama, String prodi) {
        this.npm = npm ;
        this.nama = nama ;
        this.prodi = prodi;
        System.out.println("NPM     = " + npm);
        System.out.println("Nama    = " + nama);
        System.out.println("Prodi   = " + prodi);
    }

    void cetakMhs () {
        this.nama = "mahasiswa 2";
        this.npm = 1506700023;
        this.prodi = "TI";
        System.out.println("NPM     = " +npm);
        System.out.println("Nama    = " +nama);
        System.out.println("Prodi   = " +prodi);
    }

    public static void main(String [] args) {
        konstruktorMhs mhs = new konstruktorMhs(1506700024, "Nur Imam Iskandar", "TI");
        mhs.cetakMhs();
    }
}