// NIM      : 24060124140129
// Nama     : Revanska Muhammad Athallah
// Tanggal  : 4 Mei 2026 

public class MainTeman {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN KOLEKSI KELAS DASAR (TEMAN) ===");
        
        Teman temanSaya = new Teman();
        
        temanSaya.addNama("Budi");
        temanSaya.addNama("Siti");
        temanSaya.addNama("Andi");
        temanSaya.addNama("Siti");

        temanSaya.showTeman();
        
        System.out.println("Jumlah teman saat ini: " + temanSaya.getNbelm());
        
        System.out.println("Teman di indeks ke-1: " + temanSaya.getNama(1));
        
        System.out.println("\nMengubah teman di indeks ke-0 menjadi Joko...");
        temanSaya.setNama(0, "Joko");
        temanSaya.showTeman();
        
        System.out.println("\nMengganti nama Andi menjadi Anton...");
        temanSaya.gantiNama("Andi", "Anton");
        temanSaya.showTeman();
        
        System.out.println("\nApakah Anton ada di list? " + temanSaya.isMember("Anton"));
        System.out.println("Apakah Budi ada di list? " + temanSaya.isMember("Budi"));
        
        System.out.println("Jumlah teman bernama Siti: " + temanSaya.countNama("Siti"));
        
        System.out.println("\nMenghapus Joko dari list...");
        temanSaya.delNama("Joko");
        temanSaya.showTeman();
    }
}
