
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double eGrade;
    private double mGrade;
    private double sGrade;

    public void setName (String name) {
        this.name = name;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void seteGrade (double eGrade) {
        this.eGrade = eGrade;
    }

    public void setmGrade (double mGrade) {
        this.mGrade = mGrade;
    }

    public void setsGrade (double sGrade) {
        this.sGrade = sGrade;
    }

    public String getName() {
        return name;
    }

    public void generalInfo () {
        System.out.println("Name: "+ name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
    
    public void Grades () {
        System.out.println("Name: " + name);
        System.out.println("Math Grade: " + mGrade);
        System.out.println("English Grade: " + eGrade);
        System.out.println("Science Grade: " + sGrade);
    }

    public static void main(String[] args) {
        StudentRecord annaRecord = new StudentRecord();
        annaRecord.setName("Anna");
        annaRecord.setAddress("Philippines");
        annaRecord.setAge(15);
        annaRecord.setmGrade(80);
        annaRecord.seteGrade(95.5);
        annaRecord.setsGrade(100);

        // overloaded methods
        // panggilan metode print pertama

        // panggilan metode print kedua
        annaRecord.generalInfo();
        annaRecord.Grades();
    }
}
