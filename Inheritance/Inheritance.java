package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        bukuPelajaran buku1 = new bukuPelajaran("Java 1", "Rahmat", 2023, "100.000", "Pemrograman Java 1");
        buku1.tampilBukuPelajaran();

        bukuPelajaran buku2 = new bukuPelajaran("Memulai Menjadi Web Developer dari Nol", "Fadilah", 2022, "90.000", "Rekayasa Web");
        buku2.tampilBukuPelajaran();

        bukuPelajaran buku3 = new bukuPelajaran("Bidadari Surga", "Rahmat Fadilah", 2023, "100.000", "PT Mencari Cinta Sejati");
        buku3.tampilBukuPelajaran();

        bukuPelajaran buku4 = new bukuPelajaran("Layangan tidak putus", "Rahmat", 2023, "50.000", "Bahasa Indonesia");
        buku4.tampilBukuPelajaran();
    }
}
