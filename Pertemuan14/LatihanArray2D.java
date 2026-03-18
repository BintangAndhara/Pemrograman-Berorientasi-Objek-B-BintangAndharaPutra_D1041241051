package Pertemuan14;

public class LatihanArray2D {
    public static void main(String[] args) {
        // Membuat array 2 dimensi (3x3) berisi angka 1-9
        int[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("=== TABEL 3x3 ===");

        // Perulangan untuk baris
        for (int i = 0; i < data.length; i++) {
            // Perulangan untuk kolom
            for (int j = 0; j < data[i].length; j++) {
                // Menampilkan isi array per elemen
                System.out.print(data[i][j] + " ");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}

