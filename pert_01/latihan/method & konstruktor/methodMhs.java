public class methodMhs {
    int npm;
    String nama ;

    void dataMhs() {
        System.out.println("Nama    = "+ nama);
        System.out.println("NPM     = "+ npm);
    }
    public static void main(String [] args) {
        //membuat method
        methodMhs mhs = new methodMhs();
        //memanggil atribut dan memberi nilai
        mhs.npm = 1506700024 ;
        mhs.nama = "Nur Imam Iskandar";
        //memanggil method
        mhs.dataMhs();
    }
}