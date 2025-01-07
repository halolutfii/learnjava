import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        Scanner inputCase = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("\nMenu");
            System.out.println("1. Dari terbesar hingga terkecil");
            System.out.println("2. Menghitung volume balok");
            System.out.println("3. Menghitung keliling segitiga");
            System.out.print("\nMasukkan pilihan anda: ");

            int pilihan = inputCase.nextInt();

            switch (pilihan) {
                case 1:
                System.out.println("\nAnda memilih nomor: 1");
                    int number = 50;

                    while (number >= 30) {
                        System.out.print(number + " ");
                        number--;
                    }
                    break;
                
                case 2:
                System.out.println("\n Anda memilih nomor: 2");
                Scanner inputBalok = new Scanner (System.in);

                System.out.print("Masukkan panjang balok: ");
                double panjang = inputBalok.nextDouble();

                System.out.print("Masukkan lebar balok: ");
                double lebar = inputBalok.nextDouble();

                System.out.print("Masukkan tinggi balok: ");
                double tinggi = inputBalok.nextDouble();

                double volume = panjang * lebar * tinggi;

                System.out.println("Volume balok adalah: " + volume);
                    break;

                case 3:
                System.out.println("Anda memilih nomor: 3");

                Scanner inputSegitiga = new Scanner(System.in);

                System.out.print("\nMasukkan panjang sisi pertama segitiga: ");
                double sisi1 = inputSegitiga.nextDouble();
                    
                System.out.print("Masukkan panjang sisi kedua segitiga: ");
                double sisi2 = inputSegitiga.nextDouble();
                    
                System.out.print("Masukkan panjang sisi ketiga segitiga: ");
                double sisi3 = inputSegitiga.nextDouble();

                double keliling = sisi1 + sisi2 + sisi3;
                System.out.println("Keliling segitiga adalah: " + keliling);
                    break;
                default:System.out.println("Masukkan pilihan yang benar !");
                break;
            }

            System.out.print("\n\nApakah ingin mengulang program? (y/n): ");
            String jawaban = inputCase.next();

            ulang = jawaban.equalsIgnoreCase("y");
        }
        System.out.println("\nTerimakasih !");
    }
}