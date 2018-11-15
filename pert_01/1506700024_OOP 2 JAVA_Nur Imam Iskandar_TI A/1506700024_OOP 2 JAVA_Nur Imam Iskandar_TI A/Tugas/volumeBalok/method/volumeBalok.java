/*
---------------------------------
- Program Menghitung volume Balok
- dengan menggunakan Method inputan scanner
- karya Nur Imam Iskandar
- 1506700024
---------------------------------
*/

import java.util.Scanner ;

public class volumeBalok {
    // deskripsi variabel
    int panjang, lebar, tinggi, hasil, volume ;
    
    // membuat scanner untuk inputan nilai nya
    static Scanner sc = new Scanner(System.in);
    
    // ini method scanner
    void methodScanner() {
        System.out.print("Panjang   = ");
        panjang = sc.nextInt();
        System.out.print("Lebar     = ");
        lebar = sc.nextInt();
        System.out.print("Tinggi    = ");
        tinggi = sc.nextInt();
    }

    // ini method hitung Volume
    int hitungVolume() {
        volume = (panjang*lebar*tinggi) ;
        hasil = volume ;
        return volume;
    }

    // program utama nya
    public static void main(String [] skraahh) {
        System.out.println("======== program hitung volume balok ========");
        System.out.println("Rumus Volume balok = (panjang x lebar x tinggi)");
        System.out.println("--------------==============-----------------");

        // membuat object output dari class volumeBalok
        volumeBalok output = new volumeBalok();
        // memanggil method2
        output.hitungVolume();
        output.methodScanner();

        System.out.println("=============================================");
        System.out.println("----------> Volume balok = " +output.hitungVolume() );
    }
}