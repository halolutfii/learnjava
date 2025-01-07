import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class inputFile {
    public static void main(String[] args) {
        if ( args.length == 0 ) {
            System.out.print("Masukkan nama file sebagai parameter!");
        }

        byte data;
        FileInputStream fin=null;

        try {
            fin = new FileInputStream(args[0]);
            do {
                data = (byte) fin.read();
                System.out.print((char)data);
            } while(data != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File: " + args[0] + "Tidak ditemukan.");
        } catch (IOException e) {
            System.out.println("Ekspresi tidak diketahui: " + e);
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch(IOException err) {
                    System.out.println("Ekspresi tidak dketahui: " + err);
                }
            }
        }
    }
}
