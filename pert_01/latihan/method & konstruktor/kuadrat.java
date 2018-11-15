// menggunakan method dan konstruktor

public class kuadrat {
    int bilangan ;
    int hasil ;

    // ini konstruktor
    public kuadrat(int nilai) {
        bilangan = nilai ;
    }

    // ini method 
    int getHasil() {
        hasil = bilangan * bilangan ;
        return hasil ;
    }

    // ini main nya
    public static void main(String [] args) {
        kuadrat Kuadrat = new kuadrat(8);
        System.out.println ("8 x 8 = " + Kuadrat.getHasil() );
    }
}