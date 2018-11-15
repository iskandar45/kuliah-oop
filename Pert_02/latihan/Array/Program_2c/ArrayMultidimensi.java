//
//  @ Project : latihan membuat array multi dimensi
//  @ File Name : ArrayMultidimensi.java
//  @ Date : 11/10/2018
//  @ Author : Nur Imam Iskandar
//  @ NPM : 1506700024
//
public class ArrayMultidimensi {
    public static void main(String [] Skidipapap) {

        String [][] nama = {
            {"Pak ","Bu ","Mbak "}, // index 00 = pak, index 01 = bu, index 02 = mbak
            {"Joko","Susi"}         // index 10 = joko, index 11 = susi
        };

        System.out.println(nama[0][0] + nama[1][0]);
        System.out.println(nama[0][1] + nama[1][1]);
        System.out.println(nama[0][2] + nama[1][1]);
    }
}