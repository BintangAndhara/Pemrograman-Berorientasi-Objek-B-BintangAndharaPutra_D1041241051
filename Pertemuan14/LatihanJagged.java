package Pertemuan14;

public class LatihanJagged {
    public static void main(String[] args) {

        // Membuat jagged array (jumlah kolom tiap baris berbeda)
        int[][] data = {
            {10, 20},             // baris ke-0 (2 elemen)
            {30, 40, 50, 60},     // baris ke-1 (4 elemen)
            {70, 80, 90}          // baris ke-2 (3 elemen)
        };

        System.out.println("=== JAGGED ARRAY ===");

        // Perulangan untuk setiap baris
        for (int i = 0; i < data.length; i++) {

            // Menampilkan jumlah elemen tiap baris
            System.out.print("Baris " + i + " (" + data[i].length + " elemen): ");

            // Perulangan untuk setiap kolom (pakai data[i].length biar aman)
            for (int j = 0; j < data[i].length; j++) {

                // Menampilkan isi array
                System.out.print(data[i][j] + " ");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
