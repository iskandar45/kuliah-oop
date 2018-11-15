//
//  @ Project : latihan membuat array
//  @ File Name : ArrayKota.java
//  @ Date : 11/10/2018
//  @ Author : Nur Imam Iskandar
//  @ NPM : 1506700024
//
public class ArrayKota {
    public static void main(String [] args) {
        String [] kota ;        //dekalrasi variabel array
        kota = new String[3];   //membuat objek array
        // mengisi elemen array
        kota[0] = "Jakarta";
        kota[1] = "Bandung";
        kota[2] = "Subang";
        // menampilkan element array
        System.out.println(kota[0]);
        System.out.println(kota[1]);
        System.out.println(kota[2]);
    }
}