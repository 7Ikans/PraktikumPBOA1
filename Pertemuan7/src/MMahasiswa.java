//Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 25 April 2026

public class MMahasiswa {
    public static void main(String[] args) {
        // Uji Konstruktor
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa(12345, "Budi", "Kimia");
        Mahasiswa m3 = new Mahasiswa(m2);

        System.out.println("Data Awal");
        m1.tampilData();
        m2.tampilData();
        m3.tampilData();

        System.out.println("\nSetelah Overloading setProgramStudi");
        m1.setProgramStudi();
        m1.tampilData();

        m1.setProgramStudi("Sistem Informasi");
        m1.tampilData();

        m1.setProgramStudi(m2); 
        m1.tampilData();
    }
}