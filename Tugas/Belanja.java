package Tugas;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Belanja {
    public static void main(String[] args) {
        // Input total belanja dari pengguna
        String input = JOptionPane.showInputDialog("Masukkan total belanja: ");
        double totalBelanja = Double.parseDouble(input);

        // Hitung diskon berdasarkan total belanja
        double diskon = (totalBelanja < 100000) ? 0.05 : 0.10;
        double jumlahDiskon = totalBelanja * diskon;
        double totalSetelahDiskon = totalBelanja - jumlahDiskon;

        // Format mata uang ke IDR
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance();

        // Tampilkan hasil
        String hasilPesan = "Total Belanja: " + formatRupiah.format(totalBelanja).replace("Rp", "IDR") + "\n";
        hasilPesan += "Diskon: " + (int) (diskon * 100) + "%" + "\n";
        hasilPesan += "Total Setelah Diskon: " + formatRupiah.format(totalSetelahDiskon).replace("Rp", "IDR");

        JOptionPane.showMessageDialog(null, hasilPesan);

    }
}
