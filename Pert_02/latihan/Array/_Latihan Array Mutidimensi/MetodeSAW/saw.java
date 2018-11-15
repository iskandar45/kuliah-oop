//
//  @ Project : latihan array 
//  @ File Name : saw.java
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
public class saw {
    // main program nya
    public static void main(String [] kimochi) {
        dataSaw arr1 = new dataSaw();
        arr1.array01(); // memanggil method array satu dimensi
        System.out.println(""); // membuat garis baru
        arr1.array02(); // memanggil method array dua dimensi
    }
}