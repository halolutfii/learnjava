import java.util.Scanner;

public class fungsi {
    static void beriSalam() {
        System.out.println("Halo! Selamat Pagi!");
    }
    
    static void beriUcapan(String ucapan) {
        System.out.print(ucapan);
    }

    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }
    public static void main(String[] args) {
        beriSalam();

        Scanner nama = new Scanner(System.in); // scanner input
        System.out.print("Masukkan Nama Anda : "); // input

        String userName = nama.nextLine(); // membaca inputan
        String halo = "\nHallo ! " + userName + ", ";
        beriUcapan(halo);
        beriUcapan("Selamat datang di pemrograman java");


        System.out.println("\nLuas Persegi dengan sisi 5 = " + luasPersegi(5));
    }
}
