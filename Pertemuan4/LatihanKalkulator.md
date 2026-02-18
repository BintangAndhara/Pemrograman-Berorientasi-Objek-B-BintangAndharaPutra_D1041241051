# Laporan Program LatihanKalkulator

## Deskripsi Program

Program **LatihanKalkulator** dibuat untuk mensimulasikan operasi aritmatika dasar menggunakan bahasa pemrograman Java. Program ini melakukan perhitungan sederhana seperti penjumlahan, pengurangan, perkalian, pembagian, sisa bagi, serta pembagian dalam bentuk desimal.

## Penjelasan Variabel

Program menggunakan beberapa variabel dengan tipe data berikut:

* **int angka1** → menyimpan nilai bilangan bulat pertama.
* **int angka2** → menyimpan nilai bilangan bulat kedua.
* **double pembagianDesimal** → menyimpan hasil pembagian dalam bentuk desimal dengan teknik casting.

Tipe data `int` digunakan karena operasi utama berupa bilangan bulat. Sedangkan `double` digunakan agar hasil pembagian bisa menampilkan angka di belakang koma.

## Penjelasan Operasi yang Digunakan

Beberapa operasi aritmatika yang diterapkan dalam program ini yaitu:

* **+ (Penjumlahan)** → menjumlahkan dua bilangan.
* **- (Pengurangan)** → mengurangkan bilangan pertama dengan bilangan kedua.
* *** (Perkalian)** → mengalikan dua bilangan.
* **/ (Pembagian)** → membagi dua bilangan (hasil berupa bilangan bulat karena tipe data int).
* **% (Modulus)** → menghasilkan sisa hasil bagi.
* **Casting (double)** → mengubah tipe data agar hasil pembagian menjadi desimal.

## Alur Program

1. Program mendeklarasikan dua variabel `angka1` dan `angka2`.
2. Program melakukan casting pada `angka1` ke tipe `double` untuk mendapatkan hasil pembagian desimal.
3. Program menampilkan judul "KALKULATOR".
4. Program mencetak nilai kedua angka.
5. Program menampilkan hasil setiap operasi aritmatika menggunakan `System.out.println()`.

## Output Program

Program akan menampilkan hasil perhitungan dari kedua angka yang telah ditentukan, baik dalam bentuk bilangan bulat maupun desimal.

## Kesimpulan

Program ini membantu memahami penggunaan operator aritmatika dasar dalam Java serta perbedaan hasil pembagian antara tipe data `int` dan `double`. Konsep ini penting karena dalam pengolahan data numerik, pemilihan tipe data sangat berpengaruh terhadap hasil akhir perhitungan.
