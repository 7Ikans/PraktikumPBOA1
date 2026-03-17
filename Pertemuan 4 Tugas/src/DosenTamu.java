import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen {
    // Atribut
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    // Konstruktor
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    // Method
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatDate(tanggalLahir));
        System.out.println("TMT             : " + formatDate(tmt));
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        
        Period masaKerja = Period.between(tmt, LocalDate.now());
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        
        long sisaKontrak = ChronoUnit.MONTHS.between(LocalDate.now(), tanggalBerakhirKontrak);
        System.out.println("Sisa Kontrak    : " + sisaKontrak + " bulan");
        
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
        
        double tunjangan = 0.025 * gajiPokok;
        System.out.println("Tunjangan       : 2.5% x " + formatRupiah(gajiPokok) + " = " + formatRupiah(tunjangan));
    }
}