/*
---------------------------------
- Program Menghitung volume Balok
- dengan menggunakan construkctor
- karya Nur Imam Iskandar
- 1506700024
---------------------------------
*/

public class volumeBalok {
    // deskripsi variabel
    int panjang, lebar, tinggi, hasil, volume ;
    
    // ini constructornya
    public volumeBalok(int panjang,int lebar,int tinggi) {
        this.panjang = panjang ;
        this.lebar = lebar ;
        this.tinggi = tinggi ;
        volume = (panjang*lebar*tinggi) ;
        hasil = volume ;
        System.out.println("======== program hitung volume balok ========");
        System.out.println("Rumus Volume balok = (panjang x lebar x tinggi)");
        System.out.println("--------------==============-----------------");
        System.out.println("Panjang   = "+panjang);
        System.out.println("Lebar     = "+lebar);
        System.out.println("Tinggi    = "+tinggi);
        System.out.println("=============================================");
        System.out.println("----------> Volume balok = " +hasil );
    }

    // ini program utama nya
    public static void main(String[] skraahh) {
        volumeBalok ctk = new volumeBalok(10,8,12);
    }
}