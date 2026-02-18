package Pertemuan4;
public class LatihanProduk {
    public static void main (String[] args) {
       // Deklarasi nama produk
        String produk = "Macbook Air M4";
        // Deklarasi harga satuan, jumlah stok, dan menghitung total harga stok
        int harga = 9000000, stok = 13, totalHarga = harga * stok;
        // Status ketersediaan barang (default: tersedia)
        boolean status = true;
        // Jika stok kurang dari 1, maka status menjadi tidak tersedia
        if (stok < 1) {
            status = false;
        }
        // Konstanta pajak sebesar 11%
        final double PAJAK = 0.11;
        // Menghitung total pajak dari seluruh nilai stok
        double totalPajak = totalHarga * PAJAK; 
        
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + produk);
        System.out.println("Harga Satuan: Rp " + harga);
        System.out.println("Jumlah Stok: " + stok);
        System.out.println("Status Tersedia: " + status);
        System.out.println("---");
        System.out.println("Total Nilai Stok: " + totalHarga);
        System.out.println("Total Nilai Pajak: " + totalPajak);
    }
}
