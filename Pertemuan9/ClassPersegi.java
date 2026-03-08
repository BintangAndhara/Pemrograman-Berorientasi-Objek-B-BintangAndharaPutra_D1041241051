package Pertemuan9;

// Class untuk merepresentasikan bangun datar persegi
class Persegi {

    int sisi, luas, keliling; // atribut persegi

    // Method untuk menghitung luas persegi
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    // Method untuk menghitung keliling persegi
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    // Method untuk menampilkan hasil perhitungan
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("\nSisi      : " + sisi + " cm");
        System.out.println("\nLuas      : " + luas + " cm²");
        System.out.println("\nKeliling  : " + keliling + " cm");
    }
}

// Class utama untuk menjalankan program
public class ClassPersegi {
    public static void main(String[] args) {

        // Membuat objek dari class Persegi
        Persegi obj = new Persegi();

        // Mengisi nilai sisi
        obj.sisi = 5;

        // Memanggil method untuk menghitung luas dan keliling
        obj.hitungLuas();
        obj.hitungKeliling();

        // Menampilkan hasil perhitungan
        obj.tampilkanHasil();
    }
}