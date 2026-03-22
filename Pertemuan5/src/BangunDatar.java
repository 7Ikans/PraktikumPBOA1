public abstract class BangunDatar {
    //Atribut
    private  Integer jmlSisi;
    private String Warna;
    private String border;
    protected static Integer counterBangunDatar = 0;

    //Konstruktor
    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(Integer jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        Warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    //Selektor
    public Integer getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return Warna;
    }

    public String getBorder() {
        return border;
    }

    //Mutator
    public void setJmlSisi(Integer jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    //Method
    public void printInfo() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + Warna);
        System.out.println("Border: " + border);
    }

    public static void printCounter() {
        System.out.println(counterBangunDatar);
    }

    //     public final void printInfo() {
    //     System.out.println("Jumlah Sisi: " + jmlSisi);
    //     System.out.println("Warna: " + Warna);
    //     System.out.println("Border: " + border);
    // }

    public abstract Double getLuas();

    public abstract Double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}