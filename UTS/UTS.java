package UTS;
import java.util.*;

public class UTS {
    class motor {
        String merk, warna;
        int tahun;

        public void tampilkanInfor() {
            System.out.println("Merek = " + merk);
            System.out.println("Warna = " + warna);
            System.out.println("Tahun = " + tahun);
        };
        public int hitungUsia() {
            int tahunNow = Calendar.getInstance().get(Calendar.YEAR);
            return tahunNow-tahun;
        }
        public motor (String inputMerk, String inputWarna, int inputTahun) {
            inputMerk = merk;
            inputWarna = warna;
            inputTahun = tahun;
        }
    }
}
