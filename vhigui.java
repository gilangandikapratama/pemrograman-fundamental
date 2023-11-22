import java.util.Scanner;

public class HitungIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai dari 4 mata kuliah
        System.out.println("Masukkan nilai mata kuliah 1:");
        double nilai1 = scanner.nextDouble();

        System.out.println("Masukkan nilai mata kuliah 2:");
        double nilai2 = scanner.nextDouble();

        System.out.println("Masukkan nilai mata kuliah 3:");
        double nilai3 = scanner.nextDouble();

        System.out.println("Masukkan nilai mata kuliah 4:");
        double nilai4 = scanner.nextDouble();

        // Hitung rata-rata
        double rataRata = (nilai1 + nilai2 + nilai3 + nilai4) / 4.0/ 25.0;

        // Tampilkan IP
        System.out.println("IP Anda adalah: " + rataRata);
    }
}

