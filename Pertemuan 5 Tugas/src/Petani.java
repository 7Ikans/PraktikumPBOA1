import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    
    private final int C = 2; 

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        long years = ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
        return (int) years + C;
    }

    @Override
    public double hitungPajak() {
        return 0; // Pajak petani 0
    }

    @Override
    public void cetakInfo() {
        System.out.println("\n--- Info Petani ---");
        super.cetakInfo();
        System.out.println("Asal Kota           : " + asal_kota);
    }
}