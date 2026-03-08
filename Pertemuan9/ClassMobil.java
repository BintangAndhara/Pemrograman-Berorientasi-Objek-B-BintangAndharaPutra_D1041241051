package Pertemuan9;

// Class untuk merepresentasikan objek Mobil
class Mobil {

    String merk, warna;   // atribut merk dan warna mobil
    int tahun, kecepatan; // atribut tahun pembuatan dan kecepatan mobil

    // Method untuk menampilkan spesifikasi mobil
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun + "\n");
    }

    // Method untuk menambah kecepatan mobil
    public void percepat() {
        kecepatan = kecepatan + 20; // setiap dipanggil kecepatan bertambah 20 km/jam
        System.out.println("Mobil dipercepat...");
    }

    // Method untuk menampilkan kecepatan mobil saat ini
    public void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}

// Class utama untuk menjalankan program
public class ClassMobil {
    public static void main(String[] args) {

        // Membuat objek mobil
        Mobil obj1 = new Mobil();

        // Mengisi data mobil
        obj1.merk = "Toyota Avanza";
        obj1.warna = "Silver";
        obj1.tahun = 2020;

        // Menampilkan spesifikasi mobil
        obj1.tampilkanSpesifikasi();

        // Mempercepat mobil dua kali
        obj1.percepat();
        obj1.percepat();

        // Menampilkan kecepatan mobil setelah dipercepat
        obj1.tampilkanKecepatan();
    }
}