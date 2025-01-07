// Definisi Kelas (Class)
class Mobil {
    String merek;
    String jenis;
    int tahun;
}

public class ClassdanObject {
    public static void main(String[] args) {
        // Membuat Objek dari Kelas Mobil
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil();
        
        // Mengisi Data Objek
        mobil1.merek = "Toyota";
        mobil1.jenis = "Camry";
        mobil1.tahun = 2020;
        
        mobil2.merek = "Hyundai";
        mobil2.jenis = "Palisade";
        mobil2.tahun = 2022;
    }
}