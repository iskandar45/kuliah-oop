
import java.util.Scanner;


/**

 *

 * @author hady

 */
public class Program {
    public static void main (String [] hady){
        Scanner in = new Scanner(System.in);
        int panjang , lebar ;
        double luas , keliling;
        int pilih;
        System.out.println("== Menghitung Luas dan keliling persegi panjang ==");
        System.out.print("Masukan panjang : ");
        panjang = in.nextInt();
        System.out.print("Masukan lebar : ");
        lebar = in.nextInt();
        System.out.println("1. Luas\n2. Keliling");
        System.out.print("Masukan pilihan : ");
        pilih = in.nextInt();
        switch (pilih){
            case 1 :
                luas = panjang * lebar;
                System.out.println("Luas Persegi Panjang : "+luas);
                break;
            case 2 :
                keliling = (2*panjang)+(2*lebar);
                System.out.println("Keliling Persegi Panjang : "+keliling);
                break;
        }
    }
}