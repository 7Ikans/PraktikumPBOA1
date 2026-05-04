class OperatorGenerik {
    public static <T> void Tukar(T a, T b) {
        System.out.println("  Sebelum tukar -> a: " + a + ", b: " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("  Setelah tukar -> a: " + a + ", b: " + b);
    }

    public static <T extends Kucing, U extends Kucing> double Bobot2(T a, U b) {
        return a.getBobot() + b.getBobot();
    }
}