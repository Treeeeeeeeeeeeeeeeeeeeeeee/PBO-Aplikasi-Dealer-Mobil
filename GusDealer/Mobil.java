package GusDealer;

    public class Mobil {
        String id;
        String merk;
        String model;
        String warna;
        int harga;
        int tahun;

    public Mobil(String id, String merk, String model, String warna, int harga, int tahun) {

        this.id = id;
        this.merk = merk;
        this.model = model;
        this.warna = warna;
        this.harga = harga;
        this.tahun = tahun;
    }

    public String getId() {
        return id;
    }
        public String getMerk() {
            return merk;
        }
        public String getModel() {
            return model;
        }
        public int getTahun() {
            return tahun;
        }
        public String getWarna() {
            return warna;
        }


    }

