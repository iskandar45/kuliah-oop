/*
---------------------------------
- Program Menghitung volume Balok
- dengan tanpa menggunakan method dan konstruktor
- karya Nur Imam Iskandar
- 1506700024
---------------------------------
*/

public class volumeBalok {
    // ini program utama nya
    public static void main(String[] skraahh) {
        // deskripsikan variabelnya
        int panjang = 10;
        int lebar = 8;
        int tinggi = 12;
        int volume = (panjang*lebar*tinggi) ;
        int hasil = volume ;
        // memanggil output dari hasil deskripsi variabel
        System.out.println("======== program hitung volume balok ========");
        System.out.println("Rumus Volume balok = (panjang x lebar x tinggi)");
        System.out.println("--------------==============-----------------");
        System.out.println("Panjang   = "+panjang);
        System.out.println("Lebar     = "+lebar);
        System.out.println("Tinggi    = "+tinggi);
        System.out.println("=============================================");
        System.out.println("----------> Volume balok = " +hasil );
    }
}