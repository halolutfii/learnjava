import java.util.ArrayList;
import java.util.List;

public class BookRevision {
    private List<String> judul;
    private List<String> pengarang;
    private List<Integer> tahunTerbit;
    private List<String> harga;

    public void setJudul(List<String> judul) {
        this.judul = judul;
    }
    public void setPengarang(List<String> pengarang) {
        this.pengarang = pengarang;
    }
    public void setTahunTerbit(List<Integer> tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public void setHarga(List<String> harga) {
        this.harga = harga;
    }

    public List<String> getJudul() {
        return this.judul;
    }
    public List<String> getPengarang() {
        return this.pengarang;
    }
    public List<Integer> getTahunTerbit() {
        return this.tahunTerbit;
    }
    public List<String> getHarga() {
        return this.harga;
    }

    public static void main(String[] args) {
        BookRevision Buku = new BookRevision();
        List<String> Book = new ArrayList<>();
        Book.add("Layangan Tidak Putus");
        Book.add("Rahmat Fadilah");
        Book.add("2023");
        Book.add("35.000");

        Book.add("Layangan Tidak Putus");
        Book.add("Rahmat Fadilah");
        Book.add("2023");
        Book.add("40.000");

        Buku.setJudul(Book);
        Buku.setPengarang(Book);
        Buku.setTahunTerbit(null);
        Buku.setHarga(Book);
        
        System.out.println("Buku 1: " + Book);
        System.out.println("\nBuku 2:" + Book);
    }
}
