package Pertemuan12;

class Mahasiswa {
    // Atribut static untuk menyimpan total seluruh mahasiswa
    static int jumlahMahasiswa = 0;
    String nama;

    // Constructor
    Mahasiswa(String n) {
        nama = n;
        // Setiap kali object dibuat, jumlahMahasiswa bertambah
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat: " + nama);
    }

    // Method static untuk mengambil nilai jumlahMahasiswa
    static int getJumlah() {
        return jumlahMahasiswa;
    }
}

public class LatihanMahasiswa {
    public static void main(String[] args) {
        // Membuat 3 object mahasiswa
        Mahasiswa m1 = new Mahasiswa("Andi");
        Mahasiswa m2 = new Mahasiswa("Budi");
        Mahasiswa m3 = new Mahasiswa("Citra");
        
        // Memanggil method static melalui nama Class
        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getJumlah());
    }
}