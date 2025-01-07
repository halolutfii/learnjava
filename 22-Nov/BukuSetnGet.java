public class BukuSetnGet {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private String harga;

    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    public String getJudul() {
        return this.judul;
    }
    public String getPengarang() {
        return this.pengarang;
    }
    public int getTahunTerbit() {
        return this.tahunTerbit;
    }
    public String getHarga() {
        return this.harga;
    }

    public static void main(String[] args) {
        BukuSetnGet Buku = new BukuSetnGet();

        Buku.setJudul("Tutor main marksman dek yahahaha wahyuuu");
        Buku.setPengarang("Rahmat Fadilah");
        Buku.setTahunTerbit(2023);
        Buku.setHarga("30.000");

        Buku.setJudul("Layangan Tidak Putus");
        Buku.setPengarang("Rahmat Fadilah");
        Buku.setTahunTerbit(2023);
        Buku.setHarga("45.000");
        
    
        for(int i = 0; i < 2; i++) {
            System.out.println("\nBuku Ke-" + (i+1));
            System.out.println("Judul Buku : " + Buku.getJudul());
            System.out.println("Pengarang Buku : " + Buku.getPengarang());
            System.out.println("Tahun Terbit Buku : " + Buku.getTahunTerbit());
            System.out.println("Harga Buku : " + Buku.getHarga());
        }
    }
}
