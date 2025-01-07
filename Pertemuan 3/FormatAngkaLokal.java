import java.text.*; 
import java.util.*; 
public class FormatAngkaLokal{ 
    public static void main(String args[]){ 
    double Angka=83243463.342245; 
    double AngkaPecahan=0.902235643; 
    
    NumberFormat NumberFormatterGERMANY = 
    NumberFormat.getNumberInstance(Locale.GERMANY); 
    NumberFormat CurrFormatterGERMANY = 
    NumberFormat.getCurrencyInstance(Locale.GERMANY); 
    NumberFormat PercentFormatterGERMANY = 
    NumberFormat.getPercentInstance(Locale.GERMANY); 
    
    String NumberStrGERMANY = NumberFormatterGERMANY.format(Angka); 
    String CurrStrGERMANY = CurrFormatterGERMANY.format(Angka); 
    String PercentStrGERMANY = 
    PercentFormatterGERMANY.format(AngkaPecahan); 
    
    System.out.println("double Angka = "+ Angka +" berformat number : "+NumberStrGERMANY); 
    System.out.println("double Angka = "+ Angka +" berformat currency : "+CurrStrGERMANY); 
    System.out.println("double Angka = "+ AngkaPecahan +" berformat percent : "+PercentStrGERMANY); 
    System.out.println(); 
    System.out.println(); 
    
    NumberFormat NumberFormatterUS = 
    NumberFormat.getNumberInstance(Locale.US); 
    NumberFormat CurrFormatterUS = 
    NumberFormat.getCurrencyInstance(Locale.US); 
    NumberFormat PercentFormatterUS = 
    NumberFormat.getPercentInstance(Locale.US); 
    
    String NumberStrUS = NumberFormatterUS.format(Angka); 
    String CurrStrUS = CurrFormatterUS.format(Angka);
    String PercentStrUS = PercentFormatterUS.format(AngkaPecahan); 
    
    System.out.println("double Angka = "+ Angka +" berformat number : "+NumberStrUS); 
    System.out.println("double Angka = "+ Angka +" berformat currency : "+CurrStrUS); 
    System.out.println("double Angka = "+ AngkaPecahan +" berformat percent : "+PercentStrUS); 
    } 
}