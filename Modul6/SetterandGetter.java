public class SetterandGetter {
    private String merek;
    private String jenis;
    private int tahunPembuatan;
            
    // ini method setter
    public void setMerek(String merek) {
        this.merek = merek;
    }

        public void setJenis(String jenis) {
            this.jenis = jenis;
        }

        public void setTahunPembuatan(int tahunPembuatan) {
            this.tahunPembuatan = tahunPembuatan;
        }

        // ini method getter
        public String getMerek() {
            return this.merek;
        }

        public String getJenis() {
            return this.jenis;
        }

        public int getTahunPembuatan() {
            return this.tahunPembuatan;
        }
    
    // membuat objek dari class user
    public static void main(String[] args) {
        SetterandGetter Mobil = new SetterandGetter(); // ini harus sama dengan nama file yang dibuat

        // menggunakan method setter
        Mobil.setMerek("Hyundai");
        Mobil.setJenis("Palisade");
        Mobil.setTahunPembuatan(2022);

        Mobil.setMerek("Honda");
        Mobil.setJenis("Civic Type R");
        Mobil.setTahunPembuatan(2021);

        // menggunakan method getter
        System.out.println("Rahmat Memiliki mobil berikut");
        System.out.println("Jenis Merek : " + Mobil.getMerek());
        System.out.println("Jenis Mobil : " + Mobil.getJenis());
        System.out.println("Tahun Pembuatan : " + Mobil.getTahunPembuatan());
    }
}
