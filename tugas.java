class Buku {
    String judul;
    String pengarang;
    String tahunTerbit;
    String harga;

    Buku(String judul, String pengarang, String tahunTerbit, String harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    void tampilBuku() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Pengarang Buku: " + pengarang);
        System.out.println("Tahun Terbit Buku: " + tahunTerbit);
        System.out.println("Harga Buku: " + harga);
    }
}

class bukuPelajaran extends Buku {
    String mataKuliah;

    bukuPelajaran(String judul, String pengarang, String tahunTerbit, String harga, String mataKuliah) {
        super(judul, pengarang, tahunTerbit, harga);
        this.mataKuliah = mataKuliah;
    }

    void tampilBukuPelajaran() {
        super.tampilBuku();
        System.out.println("Mata Kuliah: " + mataKuliah);
        System.out.println("");
    }
}

public class tugas {
    public static void main(String[] args) {
        bukuPelajaran buku1 = new bukuPelajaran("Java 1", "Rahmat", "2023", "100.000", "Pemrograman Java 1");
        buku1.tampilBukuPelajaran();

        bukuPelajaran buku2 = new bukuPelajaran("Memulai Menjadi Web Developer dari Nol", "Fadilah", "2022", "90.000", "Rekayasa Web");
        buku2.tampilBukuPelajaran();
    }
}
