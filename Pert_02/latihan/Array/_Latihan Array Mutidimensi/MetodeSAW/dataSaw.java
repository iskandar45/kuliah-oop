//
//  @ Project : latihan array 
//  @ File Name : dataSaw.java class of saw.java
//  @ Date : 11/10/2018
//  @ Author : Nur Imam Iskandar
//  @ NPM : 1506700024
/*
// Tampilkan data seperti berikut dengan menggunakan array
//
// |Alternatif| C1 | C2 | C3 | C4 |
// | A1       | 85 | 80 | 85 | 75 | 
// | A2       | 65 | 80 | 70 | 70 | 
// | A3       | 90 | 80 | 70 | 70 | 
// | A4       | 85 | 85 | 65 | 65 | 
// | A5       | 65 | 70 | 75 | 80 |
//
*/
public class dataSaw {
    int [] saw01;
    int [] saw02;

    // method dengan array satu dimensi
    void array01() {
        int [] saw01;
        saw01 = new int[7];
        saw01[0] = 60;
        saw01[1] = 65;
        saw01[2] = 70;
        saw01[3] = 75;
        saw01[4] = 80;
        saw01[5] = 85;
        saw01[6] = 90;
        // memanggil array satu dimensi
        System.out.println("|Alternatif| C1 | C2 | C3 | C4 |");
        System.out.println("| A1       | "+saw01[5]+" | "+saw01[4]+" | "+saw01[5]+" | "+saw01[3]+" |");
        System.out.println("| A2       | "+saw01[1]+" | "+saw01[4]+" | "+saw01[2]+" | "+saw01[2]+" |");
        System.out.println("| A3       | "+saw01[6]+" | "+saw01[4]+" | "+saw01[2]+" | "+saw01[2]+" |");
        System.out.println("| A4       | "+saw01[5]+" | "+saw01[5]+" | "+saw01[1]+" | "+saw01[1]+" |");
        System.out.println("| A5       | "+saw01[1]+" | "+saw01[2]+" | "+saw01[3]+" | "+saw01[4]+" |");
    }

    // method dengan array dua dimensi
    void array02() {
        int saw02 [][];
        saw02 = new int[5][4];
        saw02[0][0] = 85;
        saw02[0][1] = 80;
        saw02[0][2] = 85;
        saw02[0][3] = 75;
        saw02[1][0] = 65;
        saw02[1][1] = 80;
        saw02[1][2] = 70;
        saw02[1][3] = 70;
        saw02[2][0] = 90;
        saw02[2][1] = 80;
        saw02[2][2] = 70;
        saw02[2][3] = 70;
        saw02[3][0] = 85;
        saw02[3][1] = 85;
        saw02[3][2] = 65;
        saw02[3][3] = 65;
        saw02[4][0] = 65;
        saw02[4][1] = 70;
        saw02[4][2] = 75;
        saw02[4][3] = 80;
        // memanggil array dua dimensi
        System.out.println("|Alternatif| C1 | C2 | C3 | C4 |");
        System.out.println("| A1       | "+saw02[0][0]+" | "+saw02[0][1]+" | "+saw02[0][2]+" | "+saw02[0][3]+" |");
        System.out.println("| A2       | "+saw02[1][0]+" | "+saw02[1][1]+" | "+saw02[1][2]+" | "+saw02[1][3]+" |");
        System.out.println("| A3       | "+saw02[2][0]+" | "+saw02[2][1]+" | "+saw02[2][2]+" | "+saw02[2][3]+" |");
        System.out.println("| A4       | "+saw02[3][0]+" | "+saw02[3][1]+" | "+saw02[3][2]+" | "+saw02[3][3]+" |");
        System.out.println("| A4       | "+saw02[4][0]+" | "+saw02[4][1]+" | "+saw02[4][2]+" | "+saw02[4][3]+" |");
    }
}