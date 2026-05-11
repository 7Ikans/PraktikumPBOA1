// NIM      : 24060124140129
// Nama     : Revanska Muhammad Athallah
// Tanggal  : 4 Mei 2026

import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return "Indeks tidak valid";
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm = Lnama.size();
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm = Lnama.size();
            System.out.println(nama + " berhasil dihapus.");
        } else {
            System.out.println(nama + " tidak ditemukan.");
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        } else {
            System.out.println("Nama tidak ditemukan.");
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) count++;
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}