package Pertemuan13;

public class LatihanNama {
    public static void main(String[] args) {
        //Membuat Array tipe string dengan 5 isi nama
        String[] nama = {"Andi", "Budi", "Citra", "Deni", "Eka"};
        System.out.println("=== DAFTAR NAMA ===");

        // Menampilkan setiap nama dengan for loop 
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i]);
        }
    }
}
