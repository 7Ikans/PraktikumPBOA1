public class Kendaraan {
    /* ATRIBUT */
    private String noPlat; 
    private String jenis; 

    /* KONSTRUKTOR */
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* SELEKTOR (GETTER) */
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    /* MUTATOR (SETTER) */
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    /* METHOD LAIN (UTILITY) */
    public void printKendaraan() {
        System.out.println("Nomor Plat: " + noPlat);
        System.out.println("Jenis Kendaraan: " + jenis);
    }
}