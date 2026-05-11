// NIM      : 24060124140129
// Nama     : Revanska Muhammad Athallah
// Tanggal  : 10 Mei 2026

public class MainPiaraan {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN KOLEKSI KELAS BENTUKAN (PIARAAN) ===");
        
        Piaraan klinik = new Piaraan();
        
        Kucing k1 = new Kucing("Oyen", 4.5);
        Kucing k2 = new Kucing("Mochi", 3.2);
        Anabul a1 = new Anabul("Doggo", 10.0); 
        
        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(k2);
        
        klinik.showAnabul();
        
        System.out.println();
        klinik.showJenisAnabul();
        
        System.out.println("\nJumlah anabul dalam antrean: " + klinik.getNbelm());
        
        System.out.println("Apakah Oyen ada di antrean? " + klinik.isMember(k1));
        
        System.out.println("Jumlah keluarga Kucing dalam antrean: " + klinik.countKucing());
        
        System.out.println("Total bobot keluarga Kucing dalam antrean: " + klinik.bobotKucing() + " kg");
        
        System.out.println("\nAnabul yang berada di antrean paling depan: " + klinik.getAnabul().getNama());
        
        System.out.println("Memanggil anabul pertama masuk ruang rawat...");
        Anabul dipanggil = klinik.dequeueAnabul();
        System.out.println("Anabul yang sedang dirawat: " + dipanggil.getNama());
        
        System.out.println("\nSisa antrean setelah " + dipanggil.getNama() + " dirawat:");
        klinik.showAnabul();
    }
}