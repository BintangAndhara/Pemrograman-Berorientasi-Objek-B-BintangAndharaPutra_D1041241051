package Pertemuan5;

public class LatihanBilangan {
    public static void main (String[] args) {
int number = -7; // Angka yang akan diperiksa
System.out.println("=== PEMERIKSAAN BILANGAN ===");
System.out.println("Bilangan: " + number);
// Mengecek apakah bilangan positif atau negatif
if (number >= 0) {
    System.out.println("Jenis: Bilangan Positif");
    // Mengecek genap atau ganjil
    if (number % 2 == 0) {
        System.out.println("Tipe: Genap");
    } else {
        System.out.println("Tipe: Ganjil");
    }
} else { // Jika kurang dari 0 berarti negatif
    System.out.println("Jenis: Bilangan Negatif");
    // Mengecek genap atau ganjil
    if (number % 2 == 0) {
        System.out.println("Tipe: Genap");
    } else {
        System.out.println("Tipe: Ganjil");
    }
}        
    }
}
