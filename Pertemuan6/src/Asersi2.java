/**
 * Nama       : Revanska Muhammad Athallah
 * NIM        : 24060124140129
 * File       : Asersi2.java
 * Deskripsi  : Program untuk demo asersi, yang akan menolak input
 * jari-jari lingkaran yang bernilai nol
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l1 = new Lingkaran(jariJari);
        
        double kelilingLingkaran = l1.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/**
 * Konsep yang kurang tepat adalah menggunakan asersi untuk validasi input data (mengecek jari-jari > 0). Fitur asersi 
 * di Java secara default dinonaktifkan karena ditujukan murni untuk debugging. Jika program dijalankan tanpa parameter 
 * -enableassertions, validasi ini akan dilewati. Seharusnya, validasi input pengguna menggunakan struktur if-else dan 
 * melempar eksepsi (seperti IllegalArgumentException).
 */