import java.util.Scanner;

public class siakad {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama   :");
        String nama = in.nextLine();
        System.out.print("NPM    :");
        String npm = in.nextLine();
        System.out.print("Kelas  :");
        String kelas = in.nextLine();
        System.out.println("=========================================");
        System.out.println("         APLIKASI NILAI AKADEMIK         ");
        System.out.println("=========================================");
        System.out.print("Masukkan Nilai Tugas1 : ");
        double t1 = in.nextInt();
        System.out.print("Masukkan Nilai Tugas2 : ");
        double t2 = in.nextInt();
        System.out.print("Masukkan Nilai Tugas3 : ");
        double t3 = in.nextInt();
        System.out.print("Masukkan Nilai Tugas4 : ");
        double t4 = in.nextInt();
        System.out.println("=========================================");
        double tugas = (t1 + t2 + t3 + t4)/4.0 ;
        System.out.println("Nilai Tugas           : "+tugas);
        System.out.print("Masukkan Nilai UTS    : ");
        double uts = in.nextInt();
        System.out.print("Masukkan Nilai UAS    : ");
        double uas = in.nextInt();
        System.out.println("=========================================");
        double akhir = (tugas + uts + uas)/3.0 ;
        System.out.println("Nilai Akhir : "+akhir);
        System.out.println("=========================================");
        if (akhir > 90) {
            System.out.println("     Anda Berhasil dengan Sangat Baik    ");
            System.out.println("                 Grade = A               ");
        } else if (akhir > 70) {
            System.out.println("        Anda Berhasil dengan Baik        ");
            System.out.println("                 Grade = B               ");
        } else if (akhir > 60) {
            System.out.println("   Anda Berhasil dengan Nilai Minimum    ");
            System.out.println("                 Grade = C               ");
        } else {
            System.out.println("                Anda  Gagal              ");
            System.out.println("                 Grade = A               ");
        }
        System.out.println("         ***********************         ");
        System.out.println("           *******************           ");
    }
}