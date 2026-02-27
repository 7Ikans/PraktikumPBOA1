/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : [Nama Kamu]
 * Tanggal      : 23 Februari 2026
 */

public class Titik {
    /********** ATRIBUT **********/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /********** METHOD **********/
    // Konstruktor untuk membuat titik (0,0)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // 2. Konstruktor tanpa parameter [cite: 906]
    public Titik() {
        this(0, 0); 
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran(){
        if (absis == 0 && ordinat == 0){
            return 0;
        } else {
            if (absis > 0 && ordinat > 0){
                return 1;
            } else {
                if (absis < 0 && ordinat > 0){
                    return 2;
                } else {
                    if (absis < 0 && ordinat < 0){
                        return 3;
                    } else {
                        return 4;
                    }
                }
            }
        } 
    }

    int getJarakPusat() {
        if (absis == 0) {
            return (int) ordinat; 
        } else {
            if (ordinat == 0) {
                return (int) absis; 
            } else {
                long kuadrat = (long) absis * (long) absis + (long) ordinat * (long) ordinat;
            
                if (kuadrat == 0) return 0;

                double t = (double) kuadrat;
                for (int i = 0; i < 10; i++) {
                    t = (t + (double) kuadrat / t) / 2.0;
                }
                return (int) t;
            }
        }
    }

    int getJarak(Titik T) {
        double dx = (double) this.absis - T.getAbsis();
        double dy = (double) this.ordinat - T.getOrdinat();

        double kuadratJumlah = (dx * dx) + (dy * dy);

        if (kuadratJumlah == 0) return 0;

        double t = kuadratJumlah;
        for (int i = 0; i < 10; i++) {
            t = (t + kuadratJumlah / t) / 2.0;
        }
        return (int) t;
    }

    void refleksiX() {
        this.ordinat = -1 * this.ordinat;
    }

    void refleksiY() {
        this.absis = -1 * this.absis;
    }

    Titik getRefleksiX() {
        return new Titik(this.absis, -1 * this.ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(-1 * this.absis, this.ordinat);
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} // end class Titik