// NIM      : 24060124140129
// Nama     : Revanska Muhammad Athallah
// Tanggal  : 10 Mei 2026

public class Anabul {
    // Tambahkan atribut panggilan dalam kelas Anabul yang menyatakan nama panggilan hewan[cite: 1]
    protected String panggilan;
    protected double bobot; // Diperlukan untuk metode bobotKucing nanti

    public Anabul(String panggilan, double bobot) {
        this.panggilan = panggilan;
        this.bobot = bobot;
    }

    // disertai dengan fungsi getNama() dan prosedur setNama(nama)[cite: 1]
    public String getNama() {
        return this.panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public double getBobot() {
        return this.bobot;
    }
}