package Modul5;

public class testarray {
    public static void main(String[] args) {
        int[] angka = {1,3,2,5,4,7,6};
        System.out.println(angka[6]);
        for(int x = 0; x<7; x++) {
            System.out.println(angka[x]);

        }
        for(int x = 0; x< angka.length; x++) {
        System.out.println(angka[x]);
        }
    }
}
