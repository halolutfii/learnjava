import java.util.Scanner; 
public class ScannerInt{ 
    public static void main(String[] args){ 
    Scanner input = new Scanner(System.in); 
    System.out.print("Ketik bilangan pertama : "); 
    int bilangan1 = input.nextInt(); 
    
    System.out.print("Ketik bilangan kedua : "); 
    int bilangan2 = input.nextInt(); 
    System.out.print("Hasil perkalian: " + (bilangan1 * bilangan2)); 
    } 
} 