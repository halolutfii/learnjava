public class ConditionalOperator { 
    public static void main( String[] args ){ 
    String status = ""; 
    int grade = 80; 
    //mendapatkan status pelajar 
    status = (grade >= 60)?"Passed":"Fail"; 
    //print status 
    System.out.println( status ); 
    } 
} 