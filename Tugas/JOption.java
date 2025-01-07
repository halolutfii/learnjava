// Tugas JOption 27 september 2023
// Pseudo Code
/*Nama saya adalah: "namalengkap" NIM saya 'nimkalian' 
kelas 03'SIFP003 (tab) Ruang V.120 */
package Tugas;
import javax.swing.JOptionPane;

public class JOption {
    public static void main(String[] args) {
        String name;
        String nim;
        String kelas = "03'SIFP003";
        String ruang = "V.120";
        String data;

        name = JOptionPane.showInputDialog("Masukkan Nama Anda !");
        nim = JOptionPane.showInputDialog("Masukkan NIM anda");
        
        data = "Nama Saya Adalah : " + name + "\nNIM saya : " + nim + "\nKelas " + kelas + "    " + "\tRuang " + ruang;
        JOptionPane.showMessageDialog(null, data, "INFORMASI",JOptionPane.INFORMATION_MESSAGE);
    }
}