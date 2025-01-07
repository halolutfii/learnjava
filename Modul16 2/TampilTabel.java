import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class TampilTabel extends JFrame {
    static String JudulKolom[] = {"No.", "NIM", "Nama", "Angkatan", "Kelas"};
    static DefaultTableModel ModelTabel= new DefaultTableModel(null, JudulKolom);
    static JTable Tabel = new JTable();
    JScrollPane ScrollBar = new JScrollPane();
    private JPanel panelku = new JPanel();

    TampilTabel() {
        super("Menampilkan Tabel");
        setSize(400, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelku.setLayout(null);
        Tabel.setModel(ModelTabel);
        ScrollBar.getViewport().add(Tabel);
        Tabel.setEnabled(true);

        // Disable auto resizing
        Tabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Set Coloumn Width
        TableColumn col = Tabel.getColumnModel().getColumn(0);
        col.setPreferredWidth(30);

        // Coloumn Alighmment
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        Tabel.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);

        ScrollBar.setBounds(20, 20, 350, 160);
        panelku.add(ScrollBar);
        getContentPane().add(panelku);
        // getContentPane().add(ScrollBar);
        setVisible(true);
    }

    public static void main(String[] args) {
        TampilTabel frameku = new TampilTabel();
        for(int i = 0; i<=15; i++) {
            ModelTabel.insertRow(i, new Object[] {i+1, " NIM Ke-"+i, "Nama Ke-"+i, "Angkatan Ke-"+i, "Kelas Ke-"+i});
        }
        Tabel.setValueAt("Nama 1", 0, 1);
    }
}
