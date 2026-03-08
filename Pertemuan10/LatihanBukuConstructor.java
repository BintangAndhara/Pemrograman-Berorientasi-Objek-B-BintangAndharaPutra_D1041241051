package Pertemuan10;

// Class Buku untuk menyimpan data buku
class Buku {

    String judul, pengarang; // atribut buku
    int harga;

    // Constructor tanpa parameter (nilai default)
    public Buku() {
        judul = "Belum Diisi";
        pengarang = "Belum Diisi";
        harga = 0;
    }

    // Constructor dengan parameter untuk langsung mengisi data buku
    public Buku(String judul, String pengarang, int harga) {
        this.judul = judul;           // this digunakan untuk membedakan atribut dan parameter
        this.pengarang = pengarang;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanParameter() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp " + harga + "\n");
    }
}

// Class utama untuk menjalankan program
public class LatihanBukuConstructor {
    public static void main(String[] args) {

        // Membuat objek menggunakan constructor default
        Buku obj1 = new Buku();
        obj1.tampilkanParameter();

        // Membuat objek dengan constructor berparameter
        Buku obj2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
        obj2.tampilkanParameter();

        // Membuat objek buku lain dengan data berbeda
        Buku obj3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);
        obj3.tampilkanParameter();
    }
}