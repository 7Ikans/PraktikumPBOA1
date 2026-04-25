 //Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 25 April 2026

public class Seminar {
    private CivitasAkademika[] pesertas = new CivitasAkademika[100]; 
    private int banyakpeserta;
    
    public Seminar() { this.banyakpeserta = 0; }
    
    public int countPeserta() { return banyakpeserta; }
    
    public void registrasi(CivitasAkademika c) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
            System.out.println(c.getNama() + " berhasil diregistrasi.");
        } else {
            System.out.println("Kapasitas seminar penuh!");
        }
    }
    
    public void tampilPeserta() {
        System.out.println("\n--- Daftar Peserta Seminar ---");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i+1) + ". Nomor: " + pesertas[i].getNomor() + " | Nama: " + pesertas[i].getNama());
        }
    }
    
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}