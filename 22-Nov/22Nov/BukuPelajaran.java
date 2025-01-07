public class BukuPelajaran extends Buku {
    String mataKuliah;

    public BukuPelajaran(String judul, String pengarang, int tahunTerbit, String harga, String mataKuliah) {
        super(judul, pengarang, tahunTerbit, harga);
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void tampilkanInfoBuku() {
        super.tampilkanInfoBuku();
        System.out.println("Mata Kuliah: " + mataKuliah + "\n");
    }
}

class main {
    public static void main(String[] args) {
        BukuPelajaran ListBuku[] = new BukuPelajaran[3];
        ListBuku[0] = new BukuPelajaran("Layangan Tidak Putus", "Rahmat Fadilah", 2023, "45.000", "Java 1");
        ListBuku[1] = new BukuPelajaran("Tutorial main marksman dek yahaha wahyuuuu", "Rahmat Fadilah", 2023, "30.000", "Mobile Legends 2sks");
        ListBuku[2] = new BukuPelajaran("Siksa Kubur", "Rahmat Fadilah", 2022, "14.000", "Agama");

        for ( int i = 0; i < ListBuku.length; i++) {
            System.out.println("Informasi Buku Ke-" + (i+1));
            ListBuku[i].tampilkanInfoBuku();
        }
    }
}