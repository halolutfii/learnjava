import javax.swing.*;

public class TampilComboBox extends JFrame {
    final static String Pilihan[] = {"Pilihan Ke-1","Pilihan Ke-2","Pilihan Ke-3"};
    private JPanel panelku = new JPanel();
    private static JComboBox ComboBox = new JComboBox(Pilihan);

    TampilComboBox() {
        super("Membuat ComboBox");
        panelku.setLayout(null);
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ComboBox.setBounds(90, 70, 150, 25);
        panelku.add(ComboBox);
        getContentPane().add(panelku);
        setVisible(true);
    }

    public static void main(String[] args) {
        TampilComboBox frameku = new TampilComboBox();
        ComboBox.addItem("Pilihan Tambahan");
        ComboBox.removeItem("Pilihan Ke-2");
    }
}
