package Pertemuan3;

public class  LatihPerhitungan {
    public static void main (String[] args) {
        int saldo = 1000000, SaldoAkhir;
        System.out.println("Saldo Awal             : " + saldo);
        int setoran = 500000;
        System.out.println("Setoran                : " + setoran);
        SaldoAkhir = saldo + setoran;
        System.out.println("Saldo Setelah Setor    : " + SaldoAkhir);
        int penarikan = 250000;
        System.out.println("Penarikan              : " + penarikan);
        SaldoAkhir = SaldoAkhir - penarikan;
         System.out.println("Saldo Akhir           : " + SaldoAkhir);
    }
}
//Nama : Bintang Andhara Putra
//Nim : D1041241051
//Hari/tangggal : Kamis,5 Febuari 2026