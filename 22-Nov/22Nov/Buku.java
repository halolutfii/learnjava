public class Buku {
    String judul, pengarang, harga;
    int tahunTerbit;
    
    public Buku (String judul, String pengarang, int tahunTerbit, String harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    void tampilkanInfoBuku() {
        System.out.println("Judul Buku :" + judul);
        System.out.println("Pengarang Buku: " + pengarang);
        System.out.println("Tahun Terbit Buku: " + tahunTerbit);
        System.out.println("Harga Buku: " + harga);
    }
}