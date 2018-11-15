//
//  @ Project : belajar menggunakan Scanner
//  @ File Name : salamKenal.java
//  @ Date : 11/10/2018
//  @ Author : Nur Imam Iskandar
//  @ NPM : 1506700024
//
import java.util.Scanner ;

public class salamKenal {
    public static void main(String [] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Nama Anda : ");
        String nama = masukan.nextLine();
        System.out.println("==============================");
        System.out.println("Hai, Salam kenal "+nama+" !");
    }
}