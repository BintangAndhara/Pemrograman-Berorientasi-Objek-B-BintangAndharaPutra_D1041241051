Berdasarkan materi pada **Pertemuan 4** dalam *Modul PBO 2026*, berikut pemahaman saya secara singkat dan konseptual.

---

### 1. Pemahaman tentang Naming Convention

Naming convention saya pahami sebagai aturan penamaan dalam penulisan kode agar lebih terstruktur dan mudah dibaca. Dalam Java, ada pola yang sudah menjadi standar, misalnya variabel menggunakan *camelCase*, class menggunakan *PascalCase*, dan konstanta ditulis dengan huruf kapital semua.

Konsep ini bukan sekadar aturan teknis, tetapi bagian dari disiplin dalam menulis kode. Dengan penamaan yang jelas dan konsisten, orang lain bisa langsung memahami maksud variabel atau class tanpa harus membaca seluruh program.

---

### 2. Mengapa Penamaan Variabel dan Class Penting

Penamaan yang baik membantu keterbacaan dan memudahkan perawatan program. Jika variabel diberi nama yang jelas, misalnya `totalHarga` dibandingkan `th`, maka logika program lebih mudah dipahami.

Dalam konteks OOP, class merepresentasikan konsep atau entitas. Jika nama class tidak sesuai dengan fungsinya, maka desain program menjadi rancu. Jadi, penamaan bukan hanya soal gaya, tetapi juga mencerminkan cara kita memodelkan masalah.

---

### 3. Cara Kerja Operator Aritmatika dalam Java

Operator aritmatika digunakan untuk melakukan perhitungan numerik seperti penjumlahan (+), pengurangan (-), perkalian (*), pembagian (/), dan sisa bagi (%).

Cara kerjanya mengikuti aturan prioritas (precedence). Misalnya, perkalian dan pembagian diproses lebih dulu dibanding penjumlahan dan pengurangan. Selain itu, pembagian antar bilangan bulat menghasilkan bilangan bulat (tanpa desimal), sedangkan jika salah satu operand bertipe desimal, hasilnya juga desimal.

Java juga menyediakan operator tambahan seperti `++` dan `--` untuk menambah atau mengurangi nilai satu angka, serta operator gabungan seperti `+=` atau `-=` untuk mempersingkat penulisan operasi.

---

### 4. Contoh Penerapan dari Latihan

Pada latihan perhitungan saldo, variabel `saldo` diubah nilainya setelah setoran dan penarikan. Di situ terlihat bahwa variabel menyimpan state yang bisa berubah.

Contoh lain pada latihan kalkulator sederhana, ketika dua variabel bertipe `int` dibagi, hasilnya berbeda jika tidak dilakukan casting ke `double`. Dari situ saya memahami pentingnya tipe data dalam operasi aritmatika.

Selain itu, penggunaan konstanta seperti `PAJAK` dengan huruf kapital menunjukkan penerapan naming convention yang benar.

---

### 5. Kesulitan yang Dialami

Kesulitan yang saya alami terutama pada pembagian bilangan bulat yang tidak menghasilkan angka desimal. Awalnya saya mengira hasilnya otomatis desimal, tetapi ternyata perlu konversi tipe data.

Selain itu, membiasakan diri menulis nama variabel yang konsisten dan deskriptif juga membutuhkan latihan, karena sering terbawa kebiasaan menulis nama yang terlalu singkat.
