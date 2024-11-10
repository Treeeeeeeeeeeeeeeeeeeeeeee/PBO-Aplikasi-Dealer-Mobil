package GusDealer;

public class main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer("Dealer Mobil XYZ");

        // Menambahkan mobil ke stok
        MobilBensin mobil1 = new MobilBensin("MOB001", "Toyota", "Avanza", "Hitam", 200000000, 2022);
        MobilDiesel mobil2 = new MobilDiesel("MOB002", "Isuzu", "D-Max", "Putih", 300000000, 2021);

        dealer.stokMobil.tambahMobil(mobil1);
        dealer.stokMobil.tambahMobil(mobil2);

        // Menampilkan stok mobil
        dealer.stokMobil.tampilkanStok();

        // Melakukan transaksi
        dealer.jualMobil(mobil1, "Yosep", mobil1.harga);

        // Menampilkan informasi transaksi
        dealer.tampilkanDaftarTransaksi();
    }
}