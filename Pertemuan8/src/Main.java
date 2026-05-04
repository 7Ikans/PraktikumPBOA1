//Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 01 April 2026

public class Main {
    public static void main(String[] args) {
        System.out.println("=== APLIKASI BAGIAN I: DATUM ===");
        Anggora kucingAnggora = new Anggora("Mochi", 4.5);
        Kembangtelon kucingTelon = new Kembangtelon("Belang", 3.2);
        
        Datum<Kucing> datumKucing = new Datum<>(kucingAnggora);
        System.out.println("Isi awal Datum: " + datumKucing.getIsi().nama);
        datumKucing.setIsi(kucingTelon);
        System.out.println("Isi setelah setIsi: " + datumKucing.getIsi().nama);


        System.out.println("\n=== APLIKASI BAGIAN II: OPERATOR GENERIK ===");
        System.out.println("Tukar Integer:");
        OperatorGenerik.Tukar(3, 6);
        
        System.out.println("Tukar String:");
        OperatorGenerik.Tukar("Kiri", "Kanan");
        
        System.out.println("Tukar Keluarga Anabul:");
        OperatorGenerik.Tukar(kucingAnggora, kucingTelon);

        double totalBobot = OperatorGenerik.Bobot2(kucingAnggora, kucingTelon);
        System.out.println("Total bobot Mochi dan Belang: " + totalBobot + " kg");


        System.out.println("\n=== APLIKASI BAGIAN III: LARIK GENERIK ===");
        Data<Anabul> dataAnabul = new Data<>();
        
        dataAnabul.setIsi(1, kucingAnggora);
        dataAnabul.setIsi(2, kucingTelon);
        dataAnabul.setIsi(50, new Anjing("Heli"));

        System.out.println("Isi posisi 1: " + dataAnabul.getIsi(1));
        System.out.println("Isi posisi 50: " + dataAnabul.getIsi(50));
        
        System.out.println("Banyaknya elemen terisi (getSize): " + dataAnabul.getSize());
    }
}
