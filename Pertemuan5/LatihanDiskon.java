package Pertemuan5;

public class LatihanDiskon {
    public static void main(String[] args) {
       double totalBelanja = 1000000, diskon; // Total belanja dan nilai diskon
String persen; // Untuk menyimpan persentase diskon dalam bentuk teks
// Menentukan diskon berdasarkan total belanja
if (totalBelanja < 100000) {
    diskon = 0;          // Tidak dapat diskon
    persen = "0%";
} else if (totalBelanja >= 100000 && totalBelanja <= 499000) {
    diskon = totalBelanja * 0.05; // Diskon 5%
    persen = "5%";
} else if (totalBelanja >= 500000 && totalBelanja <= 999999) {
    diskon = totalBelanja * 0.10; // Diskon 10%
    persen = "10%";
} else {
    diskon = totalBelanja * 0.15; // Diskon 15%
    persen = "15%";
}
System.out.println("=== KALKULATOR DISKON ===");
System.out.println("Total Belanja: " + totalBelanja);
System.out.println("Diskon (" + persen + "): " + diskon);
// Menghitung harga akhir setelah diskon
System.out.println("Harga Akhir: " + (totalBelanja - diskon));
// Menampilkan jumlah uang yang dihemat
System.out.println("Anda hemat: Rp " + diskon);
}

}
