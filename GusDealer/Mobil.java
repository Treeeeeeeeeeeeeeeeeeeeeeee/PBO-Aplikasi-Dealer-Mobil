package GusDealer;

    public class Mobil {
        String merk;
        String model;
        int tahun;

        public Mobil(String merk, String model, int tahun) {
            this.merk = merk;
            this.model = model;
            this.tahun = tahun;
        }

        public String getMerk() {
            return merk;
        }
        public void setMerk(String merk) {
            this.merk = merk;
        }
        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public int getTahun() {
            return tahun;
        }
        public void setTahun(int tahun) {
            this.tahun = tahun;
        }
    }

