package Pertemuan4;

public class p041NamingConvention {
     // Konstanta (final) ditulis huruf besar, nilainya tidak bisa diubah
    public static final double PI = 3.14;
    public static void main (String[] args) {
        // Variabel dengan camelCase
        int studentAge = 20; 
        // Menyimpan umur mahasiswa (camelCase)

        String studentName = "Budi"; 
        // Menyimpan nama mahasiswa

        boolean isActive = true; 
        // Menyimpan status aktif (true = aktif)

        System.out.println("Nama: " + studentName);
        System.out.println("Umur: " + studentAge);
        System.out.println("Status: " + isActive);
        System.out.println("Konstanta PI: " + PI);
 }
}