 //Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 25 April 2026

public class Dosen extends CivitasAkademika {
    private String nip; 
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }
    @Override public String getNomor() { return nip; }
}