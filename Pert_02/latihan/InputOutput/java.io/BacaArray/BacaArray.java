//
//  @ Project : membuat aplikasi baca array
//  @ File Name : BacaArray.java
//  @ Date : 11/10/2018
//  @ Author : Nur Imam Iskandar
//  @ NPM : 1506700024
//
import java.io.*;

public class BacaArray {
    public static void main(String [] args) {
        int jum = 0;
        byte[] buffer = new byte[8];
        System.out.println("Ketikkan suatu kata : ");
        try {
            jum = System.in.read(buffer);
        } catch (IOException i) {
            System.err.println("Kesalahan baca");
            System.exit(1);
        }
        System.out.println("Jumlah byte : "+jum);
        System.out.println("Isi Array : ");
        for (int i = 0; i < jum; i++) {
            System.out.print("Karakter ke-"+i+": ");
            if (buffer[i] > 32) 
                System.out.print((char)buffer[i]);
             else 
                System.out.print("("+buffer[i]+")");
            
            System.out.println(""); //pindah baris
        }
    }
}