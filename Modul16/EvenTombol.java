import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EvenTombol extends JFrame {
    private JButton tombolku = new JButton("Hitung");
    private JLabel labelku = new JLabel();
    private JPanel panelku = new JPanel();
    Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    private int Jml=1;

    EvenTombol() {
        super("Event Tombol");
        panelku.setLayout(null);
        setSize(350, 200);
        setLocation(dimensi.width/2-getWidth()/2, dimensi.height/2-getHeight()/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        labelku.setBounds(55, 20, 200, 25);
        labelku.setVisible(false);
        tombolku.setBounds(100, 90, 120, 25);
        tombolku.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent env) {
                labelku.setVisible(true);
                labelku.setText("Tombol Telah Ditekan " + Jml + " kali");
                Jml++;
            }
        });
        panelku.add(labelku);
        panelku.add(tombolku);
        getContentPane().add(panelku);
        setVisible(true);
    }

    public static void main(String[] args) {
        EvenTombol evenku = new EvenTombol();
    }
}
