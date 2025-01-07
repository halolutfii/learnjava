public class Mobil {
    String merek;
    String jenis;
    int tahun;

    // Constructor
    public Mobil(String merek, String jenis, int tahun) {
        this.merek = merek;
        this.jenis = jenis;
        this.tahun = tahun;
    }
    void tampilinfo() {
        System.out.println("merek " + this.merek);
        System.out.println("merek " + this.jenis);
        System.out.println("merek " + this.tahun);
    }

    public static void main(String[] args) {
        Mobil mobilBaru = new Mobil("Hyundai", "Palisade", 2022);
        mobilBaru.tampilinfo();
    }
}
