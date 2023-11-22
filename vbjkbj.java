import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        // Inisialisasi array daftar belanja dan harga
        String[] daftarBelanja = {"Buku", "Pensil", "Bolpoin", "Notebook", "Kalkulator"};
        int[] hargaBarang = {2500, 3000, 4000, 5000, 6000};

        // Inisialisasi variabel total belanja
        int totalBelanja = 0;

        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah barang belanja
        System.out.print("Masukkan jumlah barang belanja: ");
        int jumlahBarang = scanner.nextInt();

        // Membaca input untuk setiap item dan menghitung total belanja
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Daftar Belanja:");
            for (int j = 0; j < daftarBelanja.length; j++) {
                System.out.println(j + ". " + daftarBelanja[j] + " - Harga: " + hargaBarang[j]);
            }

            System.out.print("Masukkan nomor item (0-" + (daftarBelanja.length - 1) + "): ");
            int nomorItem = scanner.nextInt();

            // Memastikan nomor item valid
            if (nomorItem >= 0 && nomorItem < hargaBarang.length) {
                totalBelanja += hargaBarang[nomorItem];
            } else {
                System.out.println("Nomor item tidak valid. Silakan masukkan nomor item yang benar.");
                i--; // Mengurangi nilai i agar pengguna dapat memasukkan nomor item yang benar.
            }
        }

        // Menampilkan total belanja
        System.out.println("Total belanja: " + totalBelanja);

        // Menutup scanner
        scanner.close();
    }
}

