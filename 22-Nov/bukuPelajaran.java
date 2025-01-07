public class bukuPelajaran extends Buku {
    
    String mataKuliah;
    String pengarang = "Rahmat Fadilah";
    

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    bukuPelajaran(String judul, String pengarang, int tahunTerbit, String harga, String mataKuliah) {
        super(judul, pengarang, tahunTerbit, harga);
        this.mataKuliah = mataKuliah;
    }
    void tampilkanInfoBuku() {
        super.tampilInfoBuku();
        System.out.println("MataKuliah: " + mataKuliah);
    }
}