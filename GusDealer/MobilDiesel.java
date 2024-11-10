package GusDealer;

public class MobilDiesel extends Mobil {
    public MobilDiesel(String id, String merk, String model, String warna, int harga, int tahun) {
        super(id, merk, model, warna, harga, tahun);
    }

    @Override
    public void infoMobil() {
        super.infoMobil();
        System.out.println("Tipe: Diesel");
    }
}