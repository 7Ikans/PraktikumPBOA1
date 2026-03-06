public class Dosen {
    /* ATRIBUT */
    private String nip;
    private String nama; 
    private String prodi; 

    /* KONSTRUKTOR */
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* SELEKTOR (GETTER) */
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    /* MUTATOR (SETTER) */
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /* METHOD PRINT */
    public void printDosen() {
        System.out.println("NIP   : " + nip);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }
}