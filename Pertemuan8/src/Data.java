//Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 01 April 2026

class Data<T> {
    private Object[] ruang;
    private int banyak;

    public Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) return null;
        return (T) ruang[posisi - 1];
    }

    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null && objek != null) {
                banyak++;
            } else if (ruang[posisi - 1] != null && objek == null) {
                banyak--;
            }
            ruang[posisi - 1] = objek;
        } else {
            System.out.println("Posisi di luar batas {1..100}");
        }
    }

    public int getSize() {
        return banyak;
    }
}