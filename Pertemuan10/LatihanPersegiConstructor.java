package Pertemuan10;

// Class Persegi untuk menghitung luas dan keliling
class Persegi {

    int sisi, luas, keliling; // atribut persegi

    // Constructor dengan parameter sisi
    public Persegi(int sisi) {

        // Validasi agar sisi tidak boleh 0 atau negatif
        if (sisi <= 0) {
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1; // jika tidak valid, otomatis diubah menjadi 1
        } else {
            this.sisi = sisi; // jika valid, gunakan nilai yang diberikan
        }

        // Menghitung luas persegi
        this.luas = this.sisi * this.sisi;

        // Menghitung keliling persegi
        this.keliling = 4 * this.sisi;
    }

    // Method untuk menampilkan hasil perhitungan
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm\n");
    }
}

// Class utama untuk menjalankan program
public class LatihanPersegiConstructor {
    public static void main(String[] args) {

        // Membuat objek dengan sisi 5
        Persegi p1 = new Persegi(5);
        p1.tampilkanHasil();

        // Membuat objek dengan sisi tidak valid (0)
        Persegi p2 = new Persegi(0);
        p2.tampilkanHasil();
    }
}