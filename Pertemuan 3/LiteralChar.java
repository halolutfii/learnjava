import javax.swing.*;

public class LiteralChar {
    public static void main(String[] args) {
        System.out.println("literal java :\'"+'\n'+"\' slash n");
        System.out.println("literal java :\'"+'\r'+"\' slash r");
        System.out.println("literal java :\'"+'\b'+"\' slash b");
        System.out.println("literal java :\'"+'\t'+"\' slash t");
        System.out.println("literal java :\'"+'\f'+"\' slash f");
        System.out.println("literal java :\'"+'\101'+"\' slash 101");
        System.out.println("literal java :\'"+'\u0416'+"\' slash u0416");

        JOptionPane.showMessageDialog(null, "literal java :\'" + '\u0416' + "\' slash u0416");
    }
}