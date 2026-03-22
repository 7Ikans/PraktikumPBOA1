import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;
    
    private final int A = 9; 

    // Konstruktor Lengkap
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Konstruktor Overload untuk p2 (Tanpa alamat awal)
    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String nip) {
        // Mengirim string kosong "" sebagai placeholder alamat
        super(nama, tgl_mulai_kerja, "", pendapatan); 
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        long years = ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
        return (int) years + A;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("\n--- Info PNS ---");
        super.cetakInfo();
        System.out.println("NIP                 : " + nip);
    }
}