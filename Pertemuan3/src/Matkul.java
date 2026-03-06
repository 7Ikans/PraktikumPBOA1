public class Matkul {
    /* ATRIBUT */
    private String idmatkul;
    private String nama;
    private int sks;

    /* KONSTRUKTOR */
    public Matkul() {
        this.idmatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public Matkul(String idmatkul, String nama, int sks) {
        this.idmatkul = idmatkul;
        this.nama = nama;
        this.sks = sks;
    }

    /* SELEKTOR (GETTER) */
    public String getIdmatkul() {
        return idmatkul;
    }

    public String getNama() {
        return nama;
    }

    public int getSKS() {
        return sks;
    }

    /* MUTATOR (SETTER) */
    public void setIdmatkul(String idmatkul) {
        this.idmatkul = idmatkul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSKS(int sks) {
        this.sks = sks;
    }

    /* METHOD LAIN (UTILITY)*/
    public void printMatKul() {
        System.out.println("ID Matkul : " + idmatkul);
        System.out.println("Nama      : " + nama);
        System.out.println("SKS       : " + sks);
    }
}
