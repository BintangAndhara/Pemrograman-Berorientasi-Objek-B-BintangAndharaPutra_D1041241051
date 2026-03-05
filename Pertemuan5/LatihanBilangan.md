# Laporan Program LatihanBilangan

## Deskripsi Program

Potongan program ini digunakan untuk mengecek **jenis bilangan** (positif atau negatif) sekaligus menentukan apakah bilangan tersebut **genap atau ganjil**.

Program memanfaatkan percabangan bertingkat (`if` di dalam `if`) untuk melakukan dua proses pengecekan dalam satu alur.

---

## Penjelasan Variabel

* **int number** → variabel yang menyimpan nilai bilangan yang akan dicek.

Nilai dari variabel `number` akan menentukan hasil output yang ditampilkan.

---

## Konsep yang Digunakan

* **If-Else** → untuk mengecek apakah bilangan positif atau negatif.
* **Nested If (If di dalam If)** → untuk mengecek apakah bilangan genap atau ganjil.
* **Operator Relasional (`>=`)** → untuk membandingkan nilai dengan 0.
* **Operator Modulus (`%`)** → untuk menentukan genap atau ganjil:

  * Jika `number % 2 == 0` → Genap
  * Jika tidak → Ganjil

---

## Alur Program

1. Program mengecek apakah `number >= 0`.

   * Jika benar → bilangan positif.
   * Jika salah → bilangan negatif.
2. Setelah menentukan jenis bilangan, program melakukan pengecekan kedua:

   * Jika habis dibagi 2 → Genap.
   * Jika tidak → Ganjil.
3. Program menampilkan hasil jenis dan tipe bilangan ke layar.

---

## Contoh Output

Jika `number = 8`

```
Jenis: Bilangan Positif
Tipe: Genap
```

Jika `number = -5`

```
Jenis: Bilangan Negatif
Tipe: Ganjil
```

---

## Kesimpulan

Program ini menunjukkan penggunaan **percabangan bertingkat (nested if)** untuk melakukan lebih dari satu pengecekan dalam satu proses.

Konsep seperti ini sering digunakan dalam validasi data atau klasifikasi nilai, misalnya dalam sistem penilaian, filter angka, atau logika pengambilan keputusan dalam program.
