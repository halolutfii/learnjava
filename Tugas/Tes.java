package Tugas;
public class Tes {
    public static void main(String[] args) {
        /* // if statement
        int nilai = 87;
        String matkul = "Pemrograman Berorientasi Objek Java-1";
        if ( nilai > 85 ) System.out.println("Kamu mendapatkan nilai A " + "di Mata Kuliah -> " + matkul); */

        int  nilai = 67;
        String matkul = "Pemrograman Berorientasi Objek Java-1";
        if ( nilai >= 70 ) { 
            System.out.println("Kamu Mendapatkan nilai A " + "di Mata Kuliah -> " + matkul);
        } else {
            System.out.println("Anda tidak lulus di matkul " + matkul);
        }
    }
}
