import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    // Atribut
    private String nidn;
    private final int BUP = 65;

    // Konstruktor
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, Double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // Method
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatDate(tanggalLahir));
        System.out.println("TMT             : " + formatDate(tmt));
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        
        Period masaKerja = Period.between(tmt, LocalDate.now());
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        
        LocalDate tanggalPensiun = tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
        System.out.println("Tanggal Pensiun : " + formatDate(tanggalPensiun));
        
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
        
        double tunjangan = 0.02 * masaKerja.getYears() * gajiPokok;
        System.out.println("Tunjangan       : 2% x " + masaKerja.getYears() + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(tunjangan));
    }
}