 //Nama    : Revanska Muhammad Athallah
 //NIM     : 24060124140129
 //Tanggal : 25 April 2026
 
public class Coercion {
    public static void main(String[] args) {
        int nilaiInt = 65;
        double nilaiReal = (double) nilaiInt;
        int nilaiIntBaru = (int) nilaiReal;
        String X = "1234", Y = "5678";
        String S = X + Y; 
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); 
        String P = "12.34", Q = "56.78";
        String R = P + Q; 
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); 
        Integer A = Integer.valueOf(S);
        String T = A.toString();

        System.out.println("Nilai sebagai integer : " + nilaiInt);
        System.out.println("Nilai sebagai karakter: " + (char) nilaiInt);
        System.out.println("Nilai sebagai real    : " + (double) nilaiInt);
        System.out.println("Dikembalikan ke int   : " + nilaiIntBaru);
        System.out.println("Konkatenasi S         : " + S);
        System.out.println("Penjumlahan Z         : " + Z);
        System.out.println("Konkatenasi R         : " + R);
        System.out.println("Penjumlahan D         : " + D);
        System.out.println("Objek Integer A       : " + A);
        System.out.println("Objek String T        : " + T);
    }
}