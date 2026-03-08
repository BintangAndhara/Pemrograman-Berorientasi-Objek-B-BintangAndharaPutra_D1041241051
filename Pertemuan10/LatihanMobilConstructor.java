package Pertemuan10;

// Class Mobil untuk menyimpan data mobil
class Mobil {

    String merk, warna; // atribut mobil
    int tahun;

    // Constructor tanpa parameter (nilai default)
    public Mobil() {
        merk = "Belum Diisi";
        warna = "Belum Diisi";
        tahun = 0;
    }

    // Constructor dengan 1 parameter (hanya mengisi merk)
    public Mobil(String merk) {
        this.merk = merk;     // this digunakan untuk menunjuk atribut class
        warna = "Belum Diisi";
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

// Class utama untuk menjalankan program
public class LatihanMobilConstructor {
    public static void main(String[] args) {

        // Membuat objek dengan constructor default
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