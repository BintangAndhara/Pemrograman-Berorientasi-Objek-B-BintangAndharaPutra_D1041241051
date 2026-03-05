# Laporan Program LatihanLogin

## Deskripsi Program

Program **LatihanLogin** dibuat untuk mensimulasikan proses validasi login sederhana menggunakan Java.

Program ini mengecek apakah **username** dan **password** yang dimasukkan sesuai dengan data yang sudah ditentukan di dalam kode. Jika keduanya benar, maka login berhasil. Jika salah satu tidak sesuai, maka login gagal.

---

## Penjelasan Variabel

Program menggunakan dua variabel utama:

* **String inputUsername** → menyimpan username yang diinput (simulasi).
* **String inputPassword** → menyimpan password yang diinput (simulasi).

Pada contoh ini:

* Username yang benar: `"admin"`
* Password yang benar: `"admin123"`

---

## Konsep yang Digunakan

* **If-Else (Nested If)** → untuk melakukan pengecekan bertahap (username lalu password).
* **Method `.equals()`** → digunakan untuk membandingkan isi teks pada `String`.
* **Operator Logika Bertingkat** → memastikan password hanya dicek jika username benar.

Catatan penting:
Pada Java, perbandingan `String` harus menggunakan `.equals()`, bukan `==`, karena `==` hanya membandingkan referensi objek, bukan isi teksnya.

---

## Alur Program

1. Program menampilkan judul "VALIDASI LOGIN".
2. Program mengecek apakah `inputUsername` sama dengan `"admin"`.

   * Jika tidak sesuai → langsung tampil pesan login gagal.
3. Jika username benar, program lanjut mengecek password.

   * Jika password benar → login berhasil.
   * Jika password salah → login gagal.
4. Program menampilkan hasil validasi ke layar.

---

## Contoh Output (Jika Username dan Password Benar)

```id="lg7p2x"
=== VALIDASI LOGIN ===
Username valid
Password benar
LOGIN BERHASIL!
Selamat datang, admin
```

---

## Kesimpulan

Program ini menunjukkan penerapan **percabangan bertingkat (nested if)** dalam proses autentikasi sederhana.

Konsep seperti ini menjadi dasar dalam pembuatan sistem login pada aplikasi, baik berbasis desktop, web, maupun mobile. Selain itu, program ini juga menegaskan pentingnya penggunaan `.equals()` saat membandingkan `String` dalam Java.
