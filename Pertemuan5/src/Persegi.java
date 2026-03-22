public class Persegi extends BangunDatar implements IResize {
    //Atribut
    private Double sisi;

    //Konstruktor
    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(Double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    //Selektor
    public Double getSisi() {
        return sisi;
    }

    //Mutator
    public void setSisi(Double sisi) {
        this.sisi = sisi;
    }

    //Method
    public Double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public Double getLuas() {
        return sisi * sisi;
    }

    @Override
    public Double getKeliling() {
        return 4 * sisi;
    }

    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }

    @Override
    public void zoom(Integer percent) {
        sisi = sisi * (percent / 100.0);
    }
}