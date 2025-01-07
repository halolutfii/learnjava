package Modul5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanarray {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        String BacaInput = "";
        Byte JmlData = 0;
        Byte DataArray[];

        System.out.print("Jumlah data :");

        try {
            BacaInput = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada Kesalahan !");
        }

        try {
            JmlData = Byte.parseByte(BacaInput);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Masukkan angka yang valid !");
            return;
        }

        JmlData = Byte.parseByte (BacaInput);
        DataArray = new Byte [JmlData];

        // Membaca data dari keyboard
        System.out.println();
        for (Byte i = 0; i < JmlData; i++) {
            System.out.print("DataArray["+i+"] = ");

            try {
                BacaInput = dataIn.readLine();
            } catch (IOException e) {
                System.out.println("Ada kesalahan !");
            }
            DataArray[i] = Byte.parseByte (BacaInput);
        }  
        // Menampilkan data dari array
        System.out.println();
        for (Byte i = 0; i < JmlData; i++) {
            System.out.println("DataArray["+i+"] = "+DataArray[i]);
        }
    }
}
