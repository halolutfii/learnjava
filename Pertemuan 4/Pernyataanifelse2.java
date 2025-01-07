import java.io.*;

public class Pernyataanifelse2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String gradestring = "";
        Byte grade = 0;

        System.out.print("Ketik nilai Anda : ");
        try {
            gradestring = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada Kesalahan !");
        } 
        grade = Byte.parseByte(gradestring);

        /* try {
            grade = Byte.parseByte(gradestring);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Masukkan input yang valid !");
            return;
        } */
        
        if ( grade >= 80 ) {
            System.out.println("Selamat Anda Lulus!");
            System.out.println("Karena nilai Anda "+grade+"!");
        } else {
            System.out.println("Maaf Anda Belum Lulus!");
            System.out.println("Karena nilai Anda "+grade+"!");
        }
    }
}
