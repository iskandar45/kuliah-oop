//
//  @ Project : membuat aplikasi baca string
//  @ File Name : bacaString.java
//  @ Date : 11/10/2018
//  @ Author : Nur Imam Iskandar
//  @ NPM : 1506700024
//
import java.io.*;

public class bacaString {
    public static void main(String [] args) {
        int kar;
        String st ="";
        boolean selesai = false;
        System.out.println("Ketikkan Suatu Kalimat : ");
        while (!selesai) {
            try {
                kar = System.in.read();
                if (kar < -1 || kar == '\n') 
                    selesai = true;
                 
                 st = st + (char) kar;
            } catch (IOException i) {
                System.err.println("Kealahan baca");
                selesai = true;
            }
        }
        System.out.println("String : "+st);
    }
    
}