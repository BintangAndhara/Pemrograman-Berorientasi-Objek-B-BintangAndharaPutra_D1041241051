package Pertemuan11;

// Class untuk merepresentasikan Persegi Panjang
class PersegiPanjang {

    int panjang, lebar, luas, keliling; // atribut bangun

    // Constructor 1 parameter (jika panjang dan lebar sama → seperti persegi)
    public PersegiPanjang(int sisi) {
        this.panjang = sisi;
        this.lebar = sisi;

        // Menghitung luas dan keliling
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    // Constructor 2 parameter (panjang dan lebar berbeda)
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;

        // Menghitung luas dan keliling
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    // Method untuk menampilkan informasi persegi panjang
    public void tampilkanInfo() {
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm\n");
    }
}

// Class utama
public class LatihanPersegiOverloading {
    public static void main(String[] args) {

        // Membuat objek dengan 1 parameter (persegi)
        PersegiPanjang obj1 = new PersegiPanjang(5);
        obj1.tampilkanInfo();

        // Membuat objek dengan 2 parameter (persegi panjang)
        PersegiPanjang obj2 = new PersegiPanjang(8, 4);
        obj2.tampilkanInfo();
    }
}