import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    // Atribut
    protected String fakultas;

    // Konstruktor
    public Dosen(String nama, String nip, LocalDate tanggalLahir, LocalDate tmt, Double gajiPokok, String fakultas) {
        super(nama, nip, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}