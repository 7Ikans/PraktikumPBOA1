//Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 01 April 2026

class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }
    public T getIsi() {
        return isi;
    }
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}