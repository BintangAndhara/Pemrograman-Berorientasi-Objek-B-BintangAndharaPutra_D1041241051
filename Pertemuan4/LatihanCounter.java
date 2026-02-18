package Pertemuan4;

public class LatihanCounter {
    public static void main (String[] args) {
        // Nilai awal counter
        int counter = 10;
        System.out.println("=== COUNTER ===");
        System.out.println("Nilai Awal: " + counter);
        // Increment (menambah 1) sebanyak 2 kali
        counter++;
        counter++;
        System.out.println("Setelah ++ (2x): " + counter);
        // Decrement (mengurangi 1).
        counter--;
        System.out.println("Setelah --: " + counter);
        // Menambahkan 5 ke nilai counter
        counter += 5;
        System.out.println("Setelah += 5: " + counter);
        // Mengurangi 3 dari nilai counter
        counter -= 3;
        System.out.println("Setelah -= 3: " + counter);
        // Mengalikan nilai counter dengan 2
        counter *= 2;
        System.out.println("Setelah *= 2: " + counter);
  }
}
