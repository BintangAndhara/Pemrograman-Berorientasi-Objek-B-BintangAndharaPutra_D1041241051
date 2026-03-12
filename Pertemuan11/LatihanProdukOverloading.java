package Pertemuan11;

// Class Produk untuk menyimpan data produk
class Produk {
    String namaProduk; // nama produk
    int harga, stok;   // harga dan jumlah stok

    // Constructor dengan 2 parameter (stok otomatis 0)
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk; // mengisi nama produk
        this.harga = harga;           // mengisi harga produk
        stok = 0;                     // stok default jika tidak diinput
    }

    // Constructor dengan 3 parameter (stok diisi langsung)
    public Produk(String namaProduk, int harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Method untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga      : Rp " + harga);
        System.out.println("Stok       : " + stok + "\n");
    }
}

// Class utama
public class LatihanProdukOverloading {
    public static void main(String[] args) {

        // Membuat objek produk tanpa mengisi stok
        Produk obj1 = new Produk("Laptop ASUS", 8500000);
        obj1.tampilkanInfo();

        // Membuat objek produk dengan stok
        Produk obj2 = new Produk("Mouse Logitech", 250000, 85);
        obj2.tampilkanInfo();
    }
}
