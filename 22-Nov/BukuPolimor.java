public class BukuPolimor {
    public static void main(String[] args) {
        bukuPelajaran Buku1 = new bukuPelajaran("Layangan Tidak Putus", "", 2023, "45.000", "Bahasa Indonesia");
        System.out.println("Pengarang Buku: " + Buku1.getPengarang());
        Buku1.tampilkanInfoBuku();
    }
}
