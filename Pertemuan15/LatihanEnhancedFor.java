package Pertemuan15;

public class LatihanEnhancedFor {
    public static void main(String[] args) {

        // Array String berisi daftar buah
        String[] buah = {"Apel", "Jeruk", "Mangga", "Anggur"};

        // Enhanced for: digunakan untuk mengakses setiap elemen array tanpa index
        // b akan berisi satu per satu isi dari array buah
        for (String b : buah) {

            // Menampilkan setiap nama buah
            System.out.println("Buah: " + b);
        }
    }
}