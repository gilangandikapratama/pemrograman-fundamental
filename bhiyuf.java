public class HitungIPK {
    public static void main(String[] args) {
        // Nilai dan bobot kredit untuk 4 mata kuliah
        double nilaiMK1 = 3.5;
        int sksMK1 = 3;

        double nilaiMK2 = 4.0;
        int sksMK2 = 4;

        double nilaiMK3 = 3.2;
        int sksMK3 = 3;

        double nilaiMK4 = 3.8;
        int sksMK4 = 2;

        // Menghitung total nilai * bobot kredit
        double totalNilaiBobot = (nilaiMK1 * sksMK1) + (nilaiMK2 * sksMK2) + (nilaiMK3 * sksMK3) + (nilaiMK4 * sksMK4);

        // Menghitung total bobot kredit
        int totalBobotKredit = sksMK1 + sksMK2 + sksMK3 + sksMK4;

        // Menghitung IP
        double ipk = totalNilaiBobot / totalBobotKredit;

        // Menampilkan IP
        System.out.println("Indeks Prestasi (IP) Anda adalah: " + ipk);
    }
}








