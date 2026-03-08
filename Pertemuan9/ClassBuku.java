package Pertemuan9;

// Class untuk merepresentasikan data buku
class IsiBuku {

    String judul;      // Menyimpan judul buku
    String pengarang;  // Menyimpan nama pengarang
    int harga;         // Menyimpan harga buku

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga : Rp " + harga);
        System.out.println();
    }
}

// Class utama untuk menjalankan program
public class ClassBuku {
    public static void main(String[] args) {

        // Membuat objek buku pertama
        IsiBuku buku1 = new IsiBuku();
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;

        // Membuat objek buku kedua
        IsiBuku buku2 = new IsiBuku();
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;

        // Menampilkan informasi kedua buku
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}