package UTS;

class mahasiswa {
    String nama;
    int[] nilai;
    mahasiswa(String inputNama, int[] inputNilai) {
        nama = inputNama;
        nilai = inputNilai;
    }
    public double hitungRataRata() {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;
    }
    public void tampilkanNilai() {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);

        }
    }
}

public class uts1 {
    public static void main(String[] args) {
        int[] nilaiMahasiswa1 = { 80, 84, 90, 78, 92 };
        int[] nilaiMahasiswa2 = { 70, 80, 75, 71, 87 };
        mahasiswa mahasiswa1 = new mahasiswa("Roni", nilaiMahasiswa1);
        mahasiswa mahasiswa2 = new mahasiswa("Joni", nilaiMahasiswa2);
        System.out.println("Data Mahasiswa");
        System.out.println();
        System.out.println("Nama: " + mahasiswa1.nama);
        mahasiswa1.tampilkanNilai();
        System.out.println("Rata-rata Nilai: " + mahasiswa1.hitungRataRata());
        System.out.println();
        System.out.println("Nama: " + mahasiswa2.nama);
        mahasiswa2.tampilkanNilai();
        System.out.println("Rata-rata Nilai: " + mahasiswa2.hitungRataRata());
    }
}