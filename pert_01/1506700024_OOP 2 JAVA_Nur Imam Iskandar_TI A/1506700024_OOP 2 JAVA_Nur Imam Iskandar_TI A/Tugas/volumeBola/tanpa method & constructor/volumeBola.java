/*
---------------------------------
- Program Menghitung volume Bola
- dengan tanpa menggunakan method dan construktor
- karya Nur Imam Iskandar
- 1506700024
---------------------------------
*/

public class volumeBola {
    // program utama nya
    public static void main(String [] skraahh) {
    // deskripsi variabel
    double r = 10;
    double pi = 3.14;
    double pembagi = (3/4.0);
    double volume = (pembagi*pi)*(r*r*r) ;
    double hasil = volume ;
    System.out.println("========= program hitung  volume bola =========");
    System.out.println("Rumus Volume bola   =  (3/4 x pi x (r x r x r))");
    System.out.println("---------------==============------------------");
    System.out.println("Jari-jari (r)   = " +r);
    System.out.println("r x r x r       = " +(r*r*r));
    System.out.println("pi              = " +pi);
    System.out.println("pembagi         = 3/4 == " +pembagi);
    System.out.println("=============================================");
    System.out.println("----------> Volume balok = " +hasil );
    }
}