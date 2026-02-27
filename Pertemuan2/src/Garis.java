public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // a. Konstruktor tanpa parameter
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // b. Konstruktor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    // c. Getter dan Setter
    public Titik getTitkAwal() { return titikAwal; }
    public void setTitkAwal(Titik awal) { this.titikAwal = awal; }

    public Titik getTitkAkhir() { return titikAkhir; }
    public void setTitkAkhir(Titik akhir) { this.titikAkhir = akhir; }

    public static int getCounterGaris() { return counterGaris; }

    // d. Method Panjang Garis
    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // e. Method Gradien (m)
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0) return Double.POSITIVE_INFINITY; // Garis vertikal
        return dy / dx;
    }

    // f. Method Titik Tengah
    public Titik getTitikTengah() {
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    // g. Cek Sejajar
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // h. Cek Tegak Lurus
    public boolean isTegakLurus(Garis g) {
        return (this.getGradien() * g.getGradien()) == -1;
    }

    // i. Tampilkan Titik
    public void tampilkanGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // j. Persamaan Garis y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}
