/*
---------------------------------
- Program Menghitung volume Bola
- dengan menggunakan construktor
- karya Nur Imam Iskandar
- 1506700024
---------------------------------
*/

public class volumeBola {
    // deskripsi variabel
    double r, volume, hasil;
    double pi = (22/7.0);
    double pembagi = (4/3.0);
    
    
    // ini constructornya
    public volumeBola(double r) {
        this.r = r ;
        volume = (pembagi*pi)*(r*r*r) ;
        hasil = volume ;
        System.out.println("========= program hitung  volume bola =========");
        System.out.println("Rumus Volume bola   =  (4/3 x pi x (r x r x r))");
        System.out.println("---------------==============------------------");
        System.out.println("Jari-jari (r)   = " +r);
        System.out.println("r x r x r       = " +(r*r*r));
        System.out.println("pi              = " +pi);
        System.out.println("pembagi         = 3/4 == " +pembagi);
        System.out.println("=============================================");
        System.out.println("----------> Volume balok = " +hasil );
    }

    // program utama nya
    public static void main(String [] skraahh) {
        // memanggil construktor
        volumeBola ctk = new volumeBola(10);
    }
}