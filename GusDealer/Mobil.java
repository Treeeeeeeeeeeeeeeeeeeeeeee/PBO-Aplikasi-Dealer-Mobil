package GusDealer;

public class Mobil {
    protected String id;
    protected String merk;
    protected String model;
    protected String warna;
    protected int harga;
    protected int tahun;

    public Mobil(String id, String merk, String model, String warna, int harga, int tahun) {
        this.id = id;
        this.merk = merk;
        this.model = model;
        this.warna = warna;
        this.harga = harga;
        this.tahun = tahun;
    }
    public void infoMobil() {
        System.out.println("ID: " + id);
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Warna: " + warna);
        System.out.println("Harga: " + harga);
        System.out.println("Tahun: " + tahun);
    }
}