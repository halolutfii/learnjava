import javax.swing.JOptionPane;

public class Perkalian {
    public static void main(String[] args) {
        String nilaiPertamaStr = JOptionPane.showInputDialog("Masukkan nilai Pertama");
        String nilaiKeduaStr = JOptionPane.showInputDialog("Masukkan nilai kedua");

        int nilaiPertama = Integer.parseInt(nilaiPertamaStr);
        int nilaiKedua= Integer.parseInt(nilaiKeduaStr);

        int Hasil = nilaiPertama * nilaiKedua;

        JOptionPane.showMessageDialog(null,"Hasil Perkalian dari " + nilaiPertama + " dan " +nilaiKedua+ "\nAdalah "+Hasil,"Hasil",JOptionPane.INFORMATION_MESSAGE);
    }
}
