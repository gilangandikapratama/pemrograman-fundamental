import java.util.Scanner;

public class HitungKeuntunganPenjualan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai modal
        System.out.print("Masukkan nilai modal: ");
        double modal = scanner.nextDouble();

        // Input persentase keuntungan
        System.out.print("Masukkan persentase keuntungan: ");
        double persentaseKeuntungan = scanner.nextDouble();

        // Hitung keuntungan
        double keuntungan = modal * (persentaseKeuntungan / 100);

        // Hitung harga jual
        double hargaJual = modal + keuntungan;

        // Menampilkan hasil
        System.out.println("Modal: " + modal);
        System.out.println("Persentase Keuntungan: " + persentaseKeuntungan + "%");
        System.out.println("Keuntungan: " + keuntungan);
        System.out.println("Harga Jual: " + hargaJual);
    }
}

