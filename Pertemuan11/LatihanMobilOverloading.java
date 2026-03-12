package Pertemuan11;

// Class Mobil
class Mobil {

    String merk, warna; // atribut mobil
    int tahun;

    // Constructor tanpa parameter (nilai default)
    public Mobil() {
        merk = "Unknown";
        warna = "Unknown";
        tahun = 0;
    }

    // Constructor dengan 1 parameter (hanya merk yang diisi)
    public Mobil(String merk) {
        this.merk = merk;   // this menunjuk ke atribut milik class
        warna = "Unknown";
        tahun = 0;
    }

    // Constructor dengan parameter lengkap
    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method untuk menampilkan spesifikasi mobil
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun + "\n");
    }
}

// Class utama
public class LatihanMobilOverloading {
    public static void main(String[] args) {

        // Membuat objek menggunakan constructor default
        Mobil obj1 = new Mobil();
        obj1.tampilkanSpesifikasi();

        // Membuat objek dengan constructor 1 parameter
        Mobil obj2 = new Mobil("Toyota");
        obj2.tampilkanSpesifikasi();

        // Membuat objek dengan constructor lengkap
        Mobil obj3 = new Mobil("Honda Civic", "Merah", 2023);
        obj3.tampilkanSpesifikasi();
    }
}