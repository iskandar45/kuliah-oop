/*
---------------------------------
- Program Menghitung volume kubus
- dengan menggunakan method dan konstruktor
- karya Nur Imam Iskandar
- 1506700024
---------------------------------
*/

public class volumeKubus {
    // deskripsi variabel
    int sisi, volume, hasil ;

    // ini constructor
    public volumeKubus(int sisi) {
        this.sisi = sisi ;
        System.out.println("====== program hitung volume kubus ======");
        System.out.println("Rumus Volume Kubus = (sisi x sisi x sisi)");
        System.out.println("------------==============---------------");
        System.out.println("Nilai sisinya  = "+sisi);
        
    }

    // ini methodnya
    void cetakHasil(){
        volume = (sisi*sisi*sisi) ;
        hasil = volume ;
        System.out.println("=========================================");
        System.out.println("----------> Volume Kubus = " +hasil);
    }

    // program utama nya
    public static void main(String [] skraahh) {
        volumeKubus ctk = new volumeKubus(7) ;
        ctk.cetakHasil();
    }
}