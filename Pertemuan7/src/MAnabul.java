//Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 25 April 2026

public class MAnabul {
    public static void main(String[] args) {
        Anabul[] peliharaan = new Anabul[3];
        peliharaan[0] = new Kucing("Miko");
        peliharaan[1] = new Anjing("Heli");
        peliharaan[2] = new Burung("Rio");

        for (Anabul hewan : peliharaan) {
            hewan.gerak();
            hewan.bersuara();
            System.out.println();
        }
    }
}