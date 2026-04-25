 //Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 25 April 2026

public class Mahasiswa {
    private int nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = -999;
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(int nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    public void setProgramStudi() { this.programStudi = "Kosong"; }
    public void setProgramStudi(String prodi) { this.programStudi = prodi; }
    public void setProgramStudi(Mahasiswa m) { this.programStudi = m.programStudi; }

    public void tampilData() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + programStudi);
    }
}