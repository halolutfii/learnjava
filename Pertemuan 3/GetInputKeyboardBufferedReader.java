import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputKeyboardBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        System.out.print("Ketik nama anda: ");
        try {
            nama = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada kesalahan !");
        }

        System.out.println();
        System.out.println("Hello " + nama + "\nLanjutkan belajarnya pasti menjadi programmer Java !");
    }
}
