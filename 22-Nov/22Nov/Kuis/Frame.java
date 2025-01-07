package Kuis;
import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        super("Ini cara membuat frame");
        setSize(get);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Frame FrameBaru = new Frame();
    }
}
