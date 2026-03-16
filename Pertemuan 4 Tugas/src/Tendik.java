import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    // Atribut
    private String bidang;
    private final int BUP = 55;

    // Konstruktor
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, Double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // Method
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatDate(tanggalLahir));
        System.out.println("TMT             : " + formatDate(tmt));
        System.out.println("Jabatan       : Tenaga Kependidikan");
        System.out.println("Bidang          : " + bidang);
        
        Period masaKerja = Period.between(tmt, LocalDate.now());
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        
        LocalDate tanggalPensiun = tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
        System.out.println("Tanggal Pensiun : " + formatDate(tanggalPensiun));
        
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
        
        double tunjangan = 0.01 * masaKerja.getYears() * gajiPokok;
        System.out.println("Tunjangan       : 1% x " + masaKerja.getYears() + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(tunjangan));
    }
}