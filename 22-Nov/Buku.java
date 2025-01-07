class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;
    String harga;

    public Buku (String judul, String pengarang, int tahunTerbit, String harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }
    
    void tampilInfoBuku() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Pengarang Buku: " + pengarang);
        System.out.println("tahun Terbit Buku: " + tahunTerbit);
        System.out.println("Harga Buku: " + harga);
    }
}
