package UTS;

import java.util.Calendar;

class motor {
    String merk, warna;
    int tahun;

    public void tampilkanInfo() {
        System.out.println("Merek = " + merk);
        System.out.println("Warna = " + warna);
        System.out.println("Tahun = " + tahun);
    };
    public int hitungUsia() {
        int tahunNow = Calendar.getInstance().get(Calendar.YEAR);
        return tahunNow-tahun;
    }
    public motor (String inputMerk, String inputWarna, int inputTahun) {
        merk = inputMerk;
        warna = inputWarna;
        tahun = inputTahun;
    }
}
public class Final {
    public static void main(String[] args) {
        motor motorList[] = new motor[3];
        motorList[0] = new motor("Honda", "Merah", 2021);
        motorList[1] = new motor("Yamaha", "Hitam", 2020);
        motorList[2] = new motor("Suzuki", "Biru", 2019);
        
        for (int x = 0; x < motorList.length; x++) {
            System.out.println("Informasi Motor Ke-" + (x+1));
            motorList[x].tampilkanInfo();
            System.out.println("Usia motor = " +motorList[x].hitungUsia() + " Tahun\n");
        }
    }
}
