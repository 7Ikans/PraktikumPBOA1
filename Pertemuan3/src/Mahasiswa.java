import java.util.ArrayList;

public class Mahasiswa {
    /* ATRIBUT */
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<Matkul> listMatKul; 
    private Dosen dosenWali;                 
    private Kendaraan kendaraan;             

    /* METHOD */
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>(); 
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    public String getNim() { 
        return nim; 
    }
    
    public void setNim(String nim) { 
        this.nim = nim; 
    }

    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String getProdi() { 
        return prodi; 
    }

    public void setProdi(String prodi) { 
        this.prodi = prodi; 
    }

    public Dosen getDosenWali() { 
        return dosenWali; 
    }

    public void setDosenWali(Dosen dosenWali) { 
        this.dosenWali = dosenWali; 
    }

    public Kendaraan getKendaraan() { 
        return kendaraan; 
    }
    
    public void setKendaraan(Kendaraan kendaraan) { 
        this.kendaraan = kendaraan; 
    }

    public void addMatKul(Matkul newMatKul) {
        if (this.listMatKul.size() < 50) {
            this.listMatKul.add(newMatKul);
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (Matkul mk : listMatKul) {
            totalSKS += mk.getSKS();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public void printDetailMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
        
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println("- " + listMatKul.get(i).getNama());
        }

        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        }

        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getNoPlat() + " (" + kendaraan.getJenis() + ")");
        }
    }
}
