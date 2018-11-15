/*
---------------------------------
- Program Menghitung volume Bola
- dengan menggunakan method dan construktor
- karya Nur Imam Iskandar
- 1506700024
---------------------------------
*/

public class volumeBola {
    // deskripsi variabel
    double r, volume, hasil;
    double pi = 3.14;
    double pembagi = (3/4.0);
    
    // ini constructornya
    public volumeBola(double r) {
        this.r = r ;
        System.out.println("========= program hitung  volume bola =========");
        System.out.println("Rumus Volume bola   =  (3/4 x pi x (r x r x r))");
        System.out.println("---------------==============------------------");
        System.out.println("Jari-jari (r)   = " +r);
        System.out.println("r x r x r       = " +(r*r*r));
        System.out.println("pi              = " +pi);
        System.out.println("pembagi         = 3/4 == " +pembagi);
    }

    // ini methodnya
    void cetakHasil() {
        volume = (pembagi*pi)*(r*r*r) ;
        hasil = volume ;
        System.out.println("=============================================");
        System.out.println("----------> Volume balok = " +hasil );
    }

    // program utama nya
    public static void main(String [] skraahh) {
        // memanggil construktor dan membuat objek
        volumeBola ctk = new volumeBola(10);  /* 10 = jari jarinya */
        // memanggil method
        ctk.cetakHasil();
    }
}