/**
 * Nama       : Revanska Muhammad Athallah
 * NIM        : 24060124140129
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/**
 * 1. Apakah baris 12 dieksekusi? Tidak. Saat input bernilai 13, perintah throw dijalankan. Perintah ini menghentikan 
 *    eksekusi method secara paksa, sehingga baris ke-12 yang bertugas mencetak tulisan tidak akan pernah dibaca oleh 
 *    program.
 * 
 * 2. Apakah baris 21 dieksekusi? Tidak. Ketika pemanggilan as.cobaAngka(13); melempar eksepsi , alur program langsung 
 *    melompat keluar dari blok try dan menuju blok catch. Akibatnya, pemanggilan as.cobaAngka(12); yang ada di bawahnya 
 *    (baris 21) langsung diabaikan.
 */