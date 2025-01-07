import java.io.*;

public class PernyataanSwitch {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String angkastring = "";
        Byte angka = 0;

        System.out.print("Ketik angka 0..9 : ");
        try {
            angkastring = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada Kesalahan !");
        }

        // Konversi nilai string ke Byte
        // angka = Byte.parseByte(angkastring);

        try {
            angka = Byte.parseByte(angkastring);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. hanya Masukkan Angka !");
            return;
        }


        switch (angka) {
            case 0: System.out.println("Angka yang diketik adalah nol");
                break;
            case 1: System.out.println("Angka yang diketik adalah satu");
                break;
            case 2: System.out.println("Angka yang diketik adalah dua");
                break;
            case 3: System.out.println("Angka yang diketik adalah tiga");
                break;
            case 4: System.out.println("Angka yang diketik adalah empat");
                break;
            case 5: System.out.println("Angka yang diketik adalah lima");
                break;
            case 6: System.out.println("Angka yang diketik adalah enam");
                break;
            case 7: System.out.println("Angka yang diketik adalah tujuh");
                break;
            case 8: System.out.println("Angka yang diketik adalah delapan");
                break;
            case 9: System.out.println("Angka yang diketik adalah sembilan");
                break;

            default: System.out.println("Angka yang diketik tidak sesuai !");
        }
    }
}
