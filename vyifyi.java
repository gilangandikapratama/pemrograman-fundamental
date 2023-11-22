public class HitungNilaiAkhir {
    public static void main(String[] args) {
        // Nilai dan bobot kredit untuk 4 mata kuliah
        double nilaiMK1 = 85.0;
        int sksMK1 = 3;

        double nilaiMK2 = 78.5;
        int sksMK2 = 4;

        double nilaiMK3 = 92.0;
        int sksMK3 = 3;

        double nilaiMK4 = 88.5;
        int sksMK4 = 2;

        // Menghitung total nilai * bobot kredit
        double totalNilaiBobot = (nilaiMK1 * sksMK1) + (nilaiMK2 * sksMK2) + (nilaiMK3 * sksMK3) + (nilaiMK4 * sksMK4);

        // Menghitung total bobot kredit
        int totalBobotKredit = sksMK1 + sksMK2 + sksMK3 + sksMK4;

        // Menghitung nilai akhir
        double nilaiAkhir = totalNilaiBobot / totalBobotKredit;

        // Menampilkan nilai akhir
        System.out.println("Nilai Akhir Anda adalah: " + nilaiAkhir);
    }
}

