//
//  @ Project : aplikasi perkalian dengan scanner
//  @ File Name : Perkalian.java
//  @ Date : 11/10/2018
//  @ Author : Nur Imam Iskandar
//  @ NPM : 1506700024
//
import java.util.Scanner;

public class Perkalian {
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Pertama : ");
        int bilangan1 = input.nextInt();
        System.out.print("Masukkan Bilangan Kedua   : ");
        int bilangan2 = input.nextInt();

        System.out.println("Hasil Perkalian : "+(bilangan1*bilangan2));
    }
}