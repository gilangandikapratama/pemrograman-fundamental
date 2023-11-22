public class pemrograman {
    public static void main(String[] args) {
        // Array untuk menyimpan data genap dan ganjil
        int[] data = {2, 5, 8, 11, 14, 17};

        // Variabel untuk menyimpan total
        int total = 0;

        // Menghitung total dan menampilkan data
        System.out.println("Data genap dan ganjil:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

            // Menambahkan nilai ke total
            total += data[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / data.length;

        // Menampilkan total dan rata-rata
        System.out.println("\nTotal: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}






