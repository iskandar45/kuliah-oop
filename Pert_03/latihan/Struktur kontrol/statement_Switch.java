public class statement_Switch {
    public static void main(String [] args) {
        char nilai = 'A';
        switch (nilai) {
            case 'C':
                System.out.println("Nilai Anda Cukup");
                break;
            case 'B':
                System.out.println("Nilai Anda Baik");
                break;
            case 'A':
                System.out.println("Nilai Anda sangat Baik");
                break;
            default: System.out.println("Nilai Anda Kosong");
                break;
        }
    }
}