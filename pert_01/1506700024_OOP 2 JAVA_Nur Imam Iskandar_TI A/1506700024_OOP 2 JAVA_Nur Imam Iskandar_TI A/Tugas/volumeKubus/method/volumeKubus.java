/*
---------------------------------
- Program Menghitung volume kubus
- dengan menggunakan Method
- karya Nur Imam Iskandar
- 1506700024
---------------------------------
*/

import java.util.Scanner ;

public class volumeKubus {
    int sisi, volume, hasil ;

    // ini method
    int hitungVolume() {
        System.out.print("Masukan sisi = ");
        sisi = sc.nextInt();
        volume = (sisi*sisi*sisi) ;
        hasil = volume ;
        return volume;
    }

    // membuat scanner untuk inputan nilai nya
    static Scanner sc = new Scanner(System.in);

    // program utama nya
    public static void main(String [] skraahh) {
        System.out.println("====== program hitung volume kubus ======");
        System.out.println("Rumus Volume Kubus = (sisi x sisi x sisi)");
        System.out.println("------------==============---------------");

        // membuat method
        volumeKubus output = new volumeKubus();

        System.out.println("=========================================");
        System.out.println("----------> Volume Kubus = " +output.hitungVolume() );
    }
}