public class overloaded {
    private double tinggi;
    private double alas;
    
    public void settinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public void setalas(double alas) {
        this.alas = alas;
    }
    public double gettinggi() {
        return tinggi;
    }
    public double getalas() {
        return alas;
    }
    public double getluas() {
        return (this.tinggi * this.alas * 0.5);
    }

    public static void main(String[] args) {
        overloaded S[] = new overloaded[2];
        Byte i;

        //membuat objek dari class segitiga
        S[0] = new overloaded();
        S[1] = new overloaded();

        S[0].settinggi(12.0);
        S[0].setalas(8.0);
        S[1].settinggi(11.23);
        S[1].setalas(7.7);

        for (i=0; i<2; i++) {
            System.out.println("Segitiga ke-"+(i+1));
            System.out.println("Tinggi = " +S[i].gettinggi());
            System.out.println("Alas = " +S[i].getalas());
            System.out.println("Luas Segitiga = " + S[i].getluas());
            System.out.println();
        }
    }
}
