public class Encapsulation {
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
        Encapsulation buku = new Encapsulation();
        
        // menggunakan method setter
        buku.setJudul("Layangan Tidak Putus");
        buku.setPengarang("Rahmat Fadilah");
        buku.setTahunTerbit(2023);
        buku.setHarga("45.000");
    
        buku.setJudul("Tutor main marksman dek yahahaha wahyuuu");
        buku.setPengarang("Rahmat Fadilah");
        buku.setTahunTerbit(2023);
        buku.setHarga("30.000");
    
        System.out.println("Judul Buku : " + buku.getJudul());
        System.out.println("Pengarang Buku : " + buku.getPengarang());
        System.out.println("Tahun Terbit Buku : " + buku.getTahunTerbit());
        System.out.println("Harga Buku : " + buku.getHarga());
    }
}
