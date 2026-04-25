//Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 25 April 2026

public class Burung extends Anabul {
    public Burung(String nama) { super(nama); }
    @Override public void gerak() { System.out.println(nama + " bergerak dengan terbang."); }
    @Override public void bersuara() { System.out.println(nama + " berbunyi cuit."); }
}