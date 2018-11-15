//
//  @ Project : latihan membuat array
//  @ File Name : NegaraKota.java
//  @ Date : 11/10/2018
//  @ Author : Nur Imam Iskandar
//  @ NPM : 1506700024
//
public class NegaraKota {
    public static void main(String [] ikkeh) {
        String nk [][] = {
            {"Amerika ","Inggris ","Jepang ","Perancis ","Indonesia ","Iran ",    "Irak "},
            // [0][0]     [0][1]    [0][2]     [0][3]       [0][4]    [0][5]     [0][6]
            {"Teheran ","Bandung ","Jakarta ","Subang "   ,"Tokyo "}
            // [1][0]     [1][1]    [1][2]     [1][3]       [1][4]
        };

        System.out.println("Ibukota "+nk[0][4]+"adalah "+nk[1][2]);
        System.out.println("Ibukota "+nk[0][2]+"adalah "+nk[1][4]);
        System.out.println("Ibukota "+nk[0][5]+"adalah "+nk[1][0]);
    }
}