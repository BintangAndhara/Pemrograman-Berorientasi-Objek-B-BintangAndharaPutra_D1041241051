# Laporan Program LatihanDiskon

## Deskripsi Program

Program **LatihanDiskon** dibuat untuk mensimulasikan perhitungan diskon berdasarkan total belanja.

Semakin besar total belanja, maka semakin besar persentase diskon yang didapat. Program ini menggunakan percabangan `if-else if` untuk menentukan kategori diskon, lalu menghitung harga akhir setelah potongan.

---

## Penjelasan Variabel

Program menggunakan beberapa variabel berikut:

* **double totalBelanja** → menyimpan total nilai belanja pelanggan.
* **double diskon** → menyimpan nilai potongan harga yang didapat.
* **String persen** → menyimpan informasi persentase diskon dalam bentuk teks.

Pada contoh program, `totalBelanja = 1.000.000`, sehingga pelanggan masuk kategori diskon 15%.

---

## Ketentuan Diskon

* Total belanja < 100.000 → **0%**
* 100.000 – 499.000 → **5%**
* 500.000 – 999.999 → **10%**
* ≥ 1.000.000 → **15%**

---

## Konsep yang Digunakan

* **If-Else If** → untuk menentukan kategori diskon berdasarkan rentang nilai.
* **Operator Relasional (`<`, `>=`, `<=`)** → untuk membandingkan nilai belanja.
* **Operasi Aritmatika (`*` dan `-`)** → untuk menghitung diskon dan harga akhir.
* **Tipe Data double** → digunakan karena perhitungan melibatkan persentase/desimal.

---

## Alur Program

1. Program menentukan nilai `totalBelanja`.
2. Program mengecek kategori diskon menggunakan `if-else if`.
3. Program menghitung nilai diskon sesuai persentase.
4. Program menampilkan:

   * Total belanja
   * Persentase diskon
   * Nilai potongan
   * Harga akhir setelah diskon
   * Jumlah uang yang dihemat

---

## Output Program (Jika totalBelanja = 1.000.000)

```id="ds8k3p"
=== KALKULATOR DISKON ===
Total Belanja: 1000000.0
Diskon (15%): 150000.0
Harga Akhir: 850000.0
Anda hemat: Rp 150000.0
```

---

## Kesimpulan

Program ini menunjukkan penerapan percabangan bertingkat untuk menentukan keputusan berdasarkan rentang nilai tertentu.

Konsep seperti ini sering digunakan dalam sistem kasir, e-commerce, atau program promosi yang membutuhkan perhitungan diskon otomatis berdasarkan total transaksi.
