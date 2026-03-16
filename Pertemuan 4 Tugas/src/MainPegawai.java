import java.time.LocalDate;

public class MainPegawai {
    public static void main(String[] args) {
        DosenTetap Dosen1 = new DosenTetap(
            "123232434", "Sams",
            LocalDate.of(1990, 9, 8),
            LocalDate.of(2002, 1, 12),
            5000000.0, "Teknik Informatika", "987654321"
        );

        DosenTamu Dosen2 = new DosenTamu(
            "987444431", "Sims",
            LocalDate.of(1995, 3, 9),
            LocalDate.of(2020, 8, 1),
            3000000.0, "Teknik Lingkungan", "123232434", LocalDate.of(2028, 2, 1)
        );

        Tendik Tendik1 = new Tendik(
            "555555555", "Sums",
            LocalDate.of(1997, 5, 15),
            LocalDate.of(2010, 6, 1),
            4000000.0, "Laboratorium"
        );

        System.out.println("=== Informasi Dosen Tetap ===");
        Dosen1.printInfo();

        System.out.println("\n=== Informasi Dosen Tamu ===");
        Dosen2.printInfo();

        System.out.println("\n=== Informasi Tenaga Kependidikan ===");
        Tendik1.printInfo();
    }
}