/* Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menguji class Titik
 * Pembuat      : [Nama Kamu]
 * Tanggal      : 23 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik T1 (0,0)
        Titik T1 = new Titik(); 
        
        T1.setAbsis(3); 
        T1.setOrdinat(4); 
        T1.printTitik(); 
        
        T1.geser(3, 4); 
        T1.printTitik(); 

        // Bagian 2 - Object Reference
        Titik T2 = T1; 
        T2.printTitik(); 
        T1.setAbsis(10); 
        T1.setOrdinat(10); 
        T2.printTitik(); 

        Titik T3 = new Titik(5, 6);
        T3.printTitik();

        System.out.println("Jumlah Objek Titik (via Class) = " + Titik.getCounterTitik());

        System.out.println("Kuadran ke = " + T1.getKuadran());

        System.out.println("Jarak ke pusat = " + T1.getJarakPusat());
        System.out.println("Jarak T1 ke T3 = " + T1.getJarak(T3)); 

        T1.refleksiX();
        System.out.println("T1 sekarang = " + T1.getOrdinat()); 

        Titik T4 = T3.getRefleksiX(); 
        System.out.println("T4 = " + T4.getAbsis() + "," + T4.getOrdinat());
        System.out.println("T3 tetap = " + T3.getOrdinat());
    } 
} 
