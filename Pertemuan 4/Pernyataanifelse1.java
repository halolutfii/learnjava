import java.io.*;


public class Pernyataanifelse1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String gradestring = "";
        Byte grade = 0;

        System.out.print("Ketik nilai Anda : ");
        try {
            gradestring = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada Kesalahan !");
            return;
        }

        try {
            grade = Byte.parseByte(gradestring);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Masukkan angka yang valid !");
            return;
        }
        // grade = Byte.parseByte(gradestring);

        if ( grade >= 80 ) System.out.println("Selamat Anda Lulus!");
        else System.out.println("Maaf Anda Belum Lulus!");
    }
}