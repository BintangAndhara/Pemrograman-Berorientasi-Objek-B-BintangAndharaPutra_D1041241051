package Pertemuan4;

public class LatihanKalkulator {
    public static void main (String[] args) {
      // Deklarasi dua angka
        int angka1 = 25, angka2 = 4;
        // Casting ke double agar hasil pembagian menjadi desimal
        double pembagianDesimal = (double) angka1 / angka2;
        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1: " + angka1);
        System.out.println("Angka 2: " + angka2);
        System.out.println("---");
        // Operasi penjumlahan
        System.out.println("Penjumlahan: " + (angka1 + angka2));
        // Operasi pengurangan
        System.out.println("Pengurangan: " + (angka1 - angka2));
        // Operasi perkalian
        System.out.println("Perkalian: " + (angka1 * angka2));
        // Operasi pembagian (hasil bilangan bulat)
        System.out.println("Pembagian: " + (angka1 / angka2));
        // Operasi sisa bagi (modulus)
        System.out.println("Sisa Bagi: " + (angka1 % angka2));
        // Pembagian dengan hasil desimal
        System.out.println("Pembagian Desimal: " + pembagianDesimal);
    }
}
