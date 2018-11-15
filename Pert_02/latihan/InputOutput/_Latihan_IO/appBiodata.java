//
//  @ Project : membuat aplkasi biodata
//  @ File Name : appBiodata.java
//  @ Date : 11/10/2018
//  @ Author : Nur Imam Iskandar
//  @ NPM : 1506700024
//
import java.util.Scanner;

public class appBiodata {
    // deklarasi variabel
    String npm,nama,alamat;
    // method untuk menampilkan header
    void header() {
        System.out.println(".:: A P L I K A S I    B I O D A T A ::.");
        System.out.println("========================================");
    }
    // method untuk membuat inputan scanner
    void methodScanner(){
        Scanner ctk = new Scanner(System.in);
        System.out.print("Masukkan NPM Anda      :");
        this.npm = ctk.nextLine();
        System.out.print("Masukkan Nama Anda     :");
        this.nama = ctk.nextLine();
        System.out.print("Masukkan Alamat Anda   :");
        this.alamat = ctk.nextLine();
    }
    // method untuk menampilkan hasil scanner
    void tampilHasil() {
        System.out.println("NPM     : "+npm+"!");
        System.out.println("Nama    : "+nama+"!");
        System.out.println("Alamat  : "+alamat+"!");
    }
    public static void main(String [] args) {
        appBiodata qq = new appBiodata();
        qq.header();
        qq.methodScanner();
        qq.tampilHasil();
    }
}