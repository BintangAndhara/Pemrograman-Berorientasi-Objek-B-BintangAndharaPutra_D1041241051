package Pertemuan5;

public class LatihanLogin {
    public static void main(String[] args) {
       System.out.println("=== VALIDASI LOGIN ===");

// Simulasi input username dan password
String inputUsername = "admin", inputPassword = "admin123";
// Mengecek apakah username sesuai
if (inputUsername.equals("admin")) {
    System.out.println("Username valid");
    // Jika username benar, lanjut cek password
    if (inputPassword.equals("admin123")) {
        System.out.println("Password benar");
        System.out.println("LOGIN BERHASIL!\nSelamat datang, admin");
    } else {
        // Jika password salah
        System.out.println("Password salah\nLOGIN GAGAL!");
    }
} else {
    // Jika username tidak sesuai
    System.out.println("Username tidak valid\nLOGIN GAGAL!");
}
    }
}
