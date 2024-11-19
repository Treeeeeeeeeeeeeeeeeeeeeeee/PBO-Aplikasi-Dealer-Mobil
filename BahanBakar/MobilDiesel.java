package BahanBakar;

import GusDealer.Mobil;

public class MobilDiesel extends Mobil {
    final String type = "Diesel";
    public MobilDiesel(String id, String merk, String model, String warna, int harga, int tahun) {
        super(id, merk, model, warna, harga, tahun);
    }

    @Override
    public void infoMobil() {
        super.infoMobil();
        System.out.println("Tipe : " + type);
    }
}