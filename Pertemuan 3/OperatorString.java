public class OperatorString { 
    public static void main(String[] args) { 
    String S1 = "Saya"; 
    String S2 = "Belajar Java"; 
    String S3 = "belajar java"; 
    
    System.out.println(S1+" "+S2); 
    System.out.println(S2.substring(0,7)); 
    System.out.println(S2.equals(S3)); 
    System.out.println(S2.equalsIgnoreCase(S3)); 
    } 
}