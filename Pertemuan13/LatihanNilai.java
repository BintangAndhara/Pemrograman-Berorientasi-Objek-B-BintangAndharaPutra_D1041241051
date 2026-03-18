package Pertemuan13;

public class LatihanNilai {
    public static void main(String[] args) {
        // Membuat array int dengan 5 isi nilai
        int[] nilai = {85, 90, 78, 92, 88};

        System.out.println("=== DAFTAR NILAI ===");
        
        // Menampilkan setiap nilai dengan for loop 
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai " + (i + 1) + ": " + nilai[i]);
        }

        // Menampilkan jumlah elemen menggunakan properti length 
        System.out.println("\nTotal Nilai: " + nilai.length);
    }
}
    

