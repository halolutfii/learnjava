import java.io.*;

public class inputConsole {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[60];

        System.out.print("Ketik 10 buah karakter: ");
        System.in.read(data);

        System.out.println("Karakter yang anda ketik adalah: ");
        for(int i=0; i<data.length; i++) {
            System.out.println((char) data[i]);
        }
    }
}
