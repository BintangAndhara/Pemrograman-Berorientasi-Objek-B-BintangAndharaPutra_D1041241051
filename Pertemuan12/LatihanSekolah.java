package Pertemuan12;
// Outer class
class Sekolah {

    String namaSekolah; // atribut milik class luar

    // Constructor Outer Class
    Sekolah(String nama) {
        namaSekolah = nama;
    }

    // Inner Class (class di dalam class)
    class Kelas {

        String namaKelas; // atribut milik inner class
        
        // Constructor Inner Class
        Kelas(String kelas) {
            namaKelas = kelas;
        }

        // Method untuk menampilkan info
        void info() {

            // Bisa akses atribut outer class langsung
            System.out.println("Sekolah: " + namaSekolah);

            // Atribut milik inner class sendiri
            System.out.println("Kelas: " + namaKelas);
        }
    }
}
// Class utama
public class LatihanSekolah {
    public static void main(String[] args) {

        // Membuat objek dari outer class
        Sekolah sekolah = new Sekolah("SMA Negeri 1");
        
        // Membuat objek inner class harus lewat object outer class
        Sekolah.Kelas kelas = sekolah.new Kelas("X-A");
        
        // Menampilkan informasi
        kelas.info();
    }
}