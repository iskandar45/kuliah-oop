/*
---------------------------------
- Program Menghitung volume Bola
- dengan menggunakan Method inputan scanner
- karya Nur Imam Iskandar
- 1506700024
---------------------------------
*/

import java.util.Scanner ;

public class volumeBola {
    // deskripsi variabel
    double r, volume, hasil;
    //double R  ;
    double pi = 3.14;
    double pembagi = (3/4.0);
    
    // membuat scanner untuk inputan nilai nya
    static Scanner sc = new Scanner(System.in);
    
    // ini method scanner
    void methodScanner() {
        System.out.print("Jari-jari (r)   = ");
        r = sc.nextInt();
        System.out.println("r x r x r       = " +(r*r*r));
        System.out.println("pi              = " +pi);
        System.out.println("pembagi         = 3/4 == " +pembagi);
    }

    // ini method hitung Volume
    double hitungVolume() {
        volume = (pembagi*pi)*(r*r*r) ;
        hasil = volume ;
        return volume;
    }

    // program utama nya
    public static void main(String [] skraahh) {
        System.out.println("========= program hitung  volume bola =========");
        System.out.println("Rumus Volume bola   =  (3/4 x pi x (r x r x r))");
        System.out.println("---------------==============------------------");

        // membuat object output dari class volumeBola
        volumeBola output = new volumeBola();
        // memanggil method2
        output.hitungVolume();
        output.methodScanner();

        System.out.println("=============================================");
        System.out.println("----------> Volume balok = " +output.hitungVolume() );
    }
}