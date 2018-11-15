
//
//  @ Project : latihan menggunakan write
//  @ File Name : ContohWrite.java
//  @ Date : 11/10/2018
//  @ Author : Nur Imam Iskandar
//  @ NPM : 1506700024
//
import java.io.*;

public class ContohWrite {
    public static void main(String [] args) {
        byte[] buffer = new byte[8];
        // isi array
        buffer[0] = (byte) 'A'; buffer[1] = (byte) 'B';
        buffer[2] = (byte) 'C'; buffer[3] = (byte) 'D';
        buffer[4] = (byte) 'E'; buffer[5] = (byte) 'F';
        buffer[6] = (byte) 'G'; buffer[7] = (byte) 'H';
        //tulis ke layar
        try {
            System.out.write(buffer);
        } 
        catch (IOException i) {
        }
        System.out.println();
    }
}