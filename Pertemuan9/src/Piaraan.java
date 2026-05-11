// NIM      : 24060124140129
// Nama     : Revanska Muhammad Athallah
// Tanggal  : 10 Mei 2026

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm = Lanabul.size();
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul keluaran = Lanabul.poll();
        if (keluaran != null) {
            nbelm = Lanabul.size();
        }
        return keluaran;
    }

    public void showAnabul() {
        System.out.println("Daftar Panggilan Anabul dalam Antrean:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += a.getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("Daftar Anabul beserta Jenisnya:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() + " (Jenis: " + a.getClass().getName() + ")");
        }
    }
}