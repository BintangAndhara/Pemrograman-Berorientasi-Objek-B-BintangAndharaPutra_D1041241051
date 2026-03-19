package Pertemuan15;

class LatihanVarArgs {

    // Method hitungRataRata menggunakan Varargs (...)
    static double hitungRataRata(int... nilai) {
        // Cek jika tidak ada argumen yang dikirim
        if (nilai.length == 0) {
            return 0;
        }

        int total = 0;
        // Menggunakan enhanced for untuk menjumlahkan isi array varargs
        for (int n : nilai) {
            total += n;
        }

        // Return hasil pembagian (casting ke double agar desimal muncul)
        return (double) total / nilai.length;
    }

    public static void main(String[] args) {
        // Memanggil method dengan 3 nilai
        double rata1 = hitungRataRata(70, 80, 90);
        System.out.println("Rata-rata (3 nilai): " + rata1);

        // Memanggil method dengan 5 nilai
        double rata2 = hitungRataRata(85, 90, 78, 92, 88);
        System.out.println("Rata-rata (5 nilai): " + rata2);
    }
}