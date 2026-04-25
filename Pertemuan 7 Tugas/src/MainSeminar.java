 //Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 25 April 2026

public class MainSeminar {
    public static void main(String[] args) {
        Seminar sem = new Seminar();
        
        Dosen d1 = new Dosen("Dr. Budi", "198001");
        Dosen d2 = new Dosen("Dr. Siti", "198002");
        
        Mahasiswa m1 = new Mahasiswa("Ahmad", "111");
        Mahasiswa m2 = new Mahasiswa("Beni", "222");
        Mahasiswa m3 = new Mahasiswa("Caca", "333");
        Mahasiswa m4 = new Mahasiswa("Deni", "444");
        Mahasiswa m5 = new Mahasiswa("Euis", "555");
        
        m1.setWali(d1); m2.setWali(d1);
        m3.setWali(d2); m4.setWali(d2); m5.setWali(d2);
        
        System.out.println("--- Data Wali Mahasiswa ---");
        m1.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
        System.out.println();

        sem.registrasi(d1); sem.registrasi(d2);
        sem.registrasi(m1); sem.registrasi(m2); sem.registrasi(m3);
        sem.registrasi(m4); sem.registrasi(m5);
        
        sem.tampilPeserta();
        
        System.out.println("\nTotal Keseluruhan Peserta : " + sem.countPeserta());
        System.out.println("Total Peserta Mahasiswa   : " + sem.countMahasiswa());
    }
}