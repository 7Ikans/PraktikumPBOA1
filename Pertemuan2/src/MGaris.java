public class MGaris {
    public static void main(String[] args) {
        // Membuat objek garis pertama (default)
        Garis g1 = new Garis();
        System.out.println("Garis 1 (Default):");
        g1.tampilkanGaris();
        System.out.println("Persamaan: " + g1.getPersamaanGaris());

        // Membuat objek garis kedua sesuai contoh soal: (-2,0) dan (0,4)
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis g2 = new Garis(t1, t2);

        System.out.println("\nGaris 2 (Custom):");
        g2.tampilkanGaris();
        System.out.println("Panjang: " + g2.getPanjang());
        System.out.println("Gradien: " + g2.getGradien());
        System.out.println("Persamaan: " + g2.getPersamaanGaris());

        // Menampilkan counter
        System.out.println("\nJumlah objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}