public class MBangunDatar{
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(7.0, "Pink", "Solid");
        Persegi persegi2 = new Persegi(3.0, "Hijau", "Dotted");
        Lingkaran lingkaran1 = new Lingkaran(2.0, "Biru", "Dashed");
        Lingkaran lingkaran2 = new Lingkaran(7.0, "Ungu", "Solid");
        BangunDatar persegi3 = new Persegi(4.0, "Putih", "Dotted");
        BangunDatar lingkaran3 = new Lingkaran(7.0, "Hitam", "Dashed");

        System.out.println("Informasi Persegi 1:");
        persegi1.printInfo();
        System.out.println("Luas Persegi: " + persegi1.getLuas());
        System.out.println("Keliling Persegi: " + persegi1.getKeliling());
        System.out.println("Diagonal Persegi: " + persegi1.getDiagonal());

        System.out.println("\nInformasi Persegi 2:");
        persegi2.printInfo();
        System.out.println("Luas Persegi: " + persegi2.getLuas());
        System.out.println("Keliling Persegi: " + persegi2.getKeliling());
        System.out.println("Diagonal Persegi: " + persegi2.getDiagonal());

        System.out.println("\nInformasi Lingkaran 1:");
        lingkaran1.printInfo();
        System.out.println("Luas Lingkaran: " + lingkaran1.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran1.getKeliling());

        System.out.println("\nInformasi Lingkaran 2:");
        lingkaran2.printInfo();
        System.out.println("Luas Lingkaran: " + lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran2.getKeliling());

        System.out.println("\nInformasi Persegi 3:");
        persegi3.printInfo();
        System.out.println("Luas Persegi: " + persegi3.getLuas());
        System.out.println("Keliling Persegi: " + persegi3.getKeliling());
        System.out.println("Diagonal Persegi: " + ((Persegi) persegi3).getDiagonal());

        System.out.println("\nInformasi Lingkaran 3:");
        lingkaran3.printInfo();
        System.out.println("Luas Lingkaran: " + lingkaran3.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran3.getKeliling());

        System.out.println("\nTotal Bangun Datar yang dibuat: " + BangunDatar.counterBangunDatar);
        System.out.println("Apakah Persegi 1 dan Persegi 2 memiliki luas yang sama? " + persegi1.isEqualLuas(persegi2));
        System.out.println("Apakah Lingkaran 1 dan Lingkaran 2 memiliki keliling yang sama? " + lingkaran1.isEqualKeliling(lingkaran2));
        System.out.println("Apakah Persegi 1 dan Lingkaran 1 memiliki luas yang sama? " + persegi1.isEqualLuas(lingkaran1));

        System.out.println("\nLuas Persegi 1 sebelum zoom: " + persegi1.getLuas());
        persegi1.zoomIn();
        System.out.println("Luas Persegi 1 setelah zoom in: " + persegi1.getLuas());
        persegi1.zoomOut();
        System.out.println("Luas Persegi 1 setelah zoom out: " + persegi1.getLuas());
        persegi1.zoom(50);
        System.out.println("Luas Persegi 1 setelah zoom 50%: " + persegi1.getLuas());

        System.out.println("\nLuas Lingkaran 1 sebelum zoom: " + lingkaran1.getLuas());
        lingkaran1.zoomIn();
        System.out.println("Luas Lingkaran 1 setelah zoom in: " + lingkaran1.getLuas());
        lingkaran1.zoomOut();
        System.out.println("Luas Lingkaran 1 setelah zoom out: " + lingkaran1.getLuas());
        lingkaran1.zoom(200);
        System.out.println("Luas Lingkaran 1 setelah zoom 200%: " + lingkaran1.getLuas());
    }
}