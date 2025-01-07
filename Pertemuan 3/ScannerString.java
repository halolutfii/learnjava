import java.util.Scanner; 
public class ScannerString { 
    public static void main( String[] args ){ 
    Scanner masukan = new Scanner(System.in); 
    
    System.out.print("Ketik Nama Anda : "); 
    String nama = masukan.nextLine(); 
    
    System.out.println("Halo " + nama + ", kamu sekarang sudah bisa java"); 
    } 
} 
