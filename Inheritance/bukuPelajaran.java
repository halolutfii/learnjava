package Inheritance;

public class bukuPelajaran extends Buku {
    String mataKuliah;

    bukuPelajaran(String judul, String pengarang, int tahunTerbit, String harga, String mataKuliah) {
        super(judul, pengarang, tahunTerbit, harga);
        this.mataKuliah = mataKuliah;
    }

    void tampilBukuPelajaran() {
        super.tampilBuku();
        System.out.println("Mata Kuliah: " + mataKuliah+ "\n");
    }
}