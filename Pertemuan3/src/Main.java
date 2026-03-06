public class Main {
    public static void main(String[] args) {
        Matkul PBO = new Matkul("PBO", "Pemrograman Berorientasi Objek", 3);
        Matkul MBD = new Matkul("MBD", "Manajemen Basis Data", 3); 

        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika"); 

        Dosen D1 = new Dosen("123", "Andi", "Informatika");       

        Kendaraan K1 = new Kendaraan("H1234AB", "motor");               
        
        M1.setDosenWali(D1); 

        M1.setKendaraan(K1);

        M1.addMatKul(PBO);  
        M1.addMatKul(MBD);   

        System.out.println("DETAIL MAHASISWA");
        M1.printDetailMhs(); 

        System.out.println("\nAKADEMIK");
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatKul()); 
        
        System.out.println("Total SKS yang diambil: " + M1.getJumlahSKS());
    }
}

