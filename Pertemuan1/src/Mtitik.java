/* Nama File    : MTitik.java
 * Deskripsi    : berisi aplikasi method dalam class Titik
 * Pembuat      : Revanska Muhammad Athallah
 * Tanggal      : 18 Februari 2025
*/

public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); 
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        
        T1.geser(3, 4);
        T1.printTitik();
    }
}
