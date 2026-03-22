public class Lingkaran extends BangunDatar implements IResize {
    //Atribut
    private Double jari;

    //Konstruktor
    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(Double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    //Selektor
    public Double getJari() {
        return jari;
    }

    //Mutator
    public void setJari(Double jari) {
        this.jari = jari;
    }

    //Method
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    @Override
    public Double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public Double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn() {
        jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jari *= 0.9;
    }

    @Override
    public void zoom(Integer percent) {
        jari = jari * (percent / 100.0);
    }
}