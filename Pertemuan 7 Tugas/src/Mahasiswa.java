 //Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 25 April 2026

public class Mahasiswa extends CivitasAkademika {
    private String nim; 
    private Dosen dosenWali; 
    
    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }
    
    @Override public String getNomor() { return nim; }
    public void setWali(Dosen d) { this.dosenWali = d; }
    
    public void tampilDataMahasiswa() {
        String namaWali = (dosenWali != null) ? dosenWali.getNama() : "Belum ada wali";
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Dosen Wali: " + namaWali);
    }
}