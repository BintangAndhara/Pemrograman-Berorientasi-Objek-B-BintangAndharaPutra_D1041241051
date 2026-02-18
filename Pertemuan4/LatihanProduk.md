# Laporan Program LatihanProduk

## Deskripsi Program

Program **LatihanProduk** dibuat untuk mensimulasikan pengolahan data produk sederhana menggunakan Java. Program ini menyimpan informasi produk seperti nama barang, harga satuan, jumlah stok, status ketersediaan, serta menghitung total nilai stok dan pajaknya.

Konsep yang dipakai di sini sudah mulai masuk ke kombinasi tipe data, percabangan (`if`), konstanta (`final`), dan operasi aritmatika.

## Penjelasan Variabel

Program menggunakan beberapa tipe data dasar, yaitu:

* **String produk** → menyimpan nama produk dalam bentuk teks.
* **int harga** → menyimpan harga satuan produk.
* **int stok** → menyimpan jumlah stok barang.
* **int totalHarga** → menyimpan hasil perkalian harga × stok.
* **boolean status** → menunjukkan apakah produk tersedia atau tidak.
* **final double PAJAK** → konstanta pajak sebesar 11% (tidak bisa diubah).
* **double totalPajak** → menyimpan hasil perhitungan pajak dari total nilai stok.

Penggunaan `final` pada variabel pajak bertujuan agar nilainya tetap dan tidak bisa dimodifikasi selama program berjalan.

## Alur Program

1. Program mendeklarasikan dan menginisialisasi data produk.
2. Program menghitung `totalHarga` dari harga dikali stok.
3. Program mengecek kondisi stok menggunakan percabangan `if`.

   * Jika stok kurang dari 1, maka status akan diubah menjadi `false`.
4. Program mendeklarasikan konstanta pajak sebesar 11%.
5. Program menghitung total pajak dari total nilai stok.
6. Semua informasi ditampilkan ke layar menggunakan `System.out.println()`.

## Output Program

Program akan menampilkan informasi lengkap produk, mulai dari nama, harga, jumlah stok, status ketersediaan, hingga total nilai stok dan total pajak yang harus dibayarkan.

## Kesimpulan

Program ini melatih pemahaman tentang penggunaan berbagai tipe data dalam satu kasus sederhana. Selain itu, program juga mengenalkan konsep percabangan dan konstanta dalam Java. Latihan seperti ini penting karena sudah mendekati studi kasus sederhana yang sering dipakai dalam sistem penjualan atau manajemen inventori.
