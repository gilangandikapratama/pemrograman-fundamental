public class gilang import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();

        // Membuat array untuk menyimpan data
        int[] data = new int[jumlahData];
5
        // Input data
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        // Menampilkan data
        System.out.println("Data yang dimasukkan:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + data[i]);
        }
    }
}






{
}
