import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    // Atribut
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // Konstruktor
    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selektor
    public static int getCounterMns() {
        return counterMns;
    }

    // Mutator
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method
    public void cetakInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : Rp " + (long)pendapatan);
    }

    // Method abstract untuk menghitung masa kerja
    public abstract int hitungMasaKerja();
}