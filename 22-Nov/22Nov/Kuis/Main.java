package Kuis;

class Hewan {
    private final String jenis;
    private int usia;
    public Hewan(String jenis, int usia) {
        this.jenis = jenis;
        this.usia = usia;
    }

    public String setJenis() {
        return jenis;
    }

    public int getUsia() {
        return usia;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Usia: " + usia + " Tahun");
    }

    public void setUsia(int usia) {
        if (usia >= 0) {
            this.usia = usia;
        } else {
            System.out.println("Usia Tidak Valid");
        }
    }

    public void periksaKesehatan() {
        System.out.println("Mengecek Kesehatan Hewan...");
        if (cekGigi() && cekMata()) {
            System.out.println("Kondisi Kesehatan hewan baik.");
        } else {
            System.out.println("Ada masalah dengan kesehatan hewan !");
        }
    }

    public void periksaKesehatan(boolean printInfo) {
        periksaKesehatan();
        if (printInfo) {
            tampilkanInfo();
        }
    }

    private boolean cekGigi() {
        System.out.println("Memeriksa gigi...");
        return true;
    }

    private boolean cekMata() {
        System.out.println("Memeriksa mata...");
        return true;
    }
}

class Mamalia extends Hewan {
    private String habitat;

    public Mamalia(String jenis, int usia, String habitat) {
        super(jenis, usia);
        this.habitat = habitat;
    }
    public void tampilkanInfo() {
        System.out.println("Ini adalah mamalia " + this.getJenis() + " yang hidup di " + habitat);
        System.out.println("Usia: " + getUsia() + "Tahun");
    }
}

class Reptil extends Hewan {
    private boolean bersisik;

    public Reptil(String jenis, int usia, boolean bersisik) {
        super(jenis, usia);
        this.bersisik = bersisik;
    }
    
    public void tampilkanInfo() {
        String keadaanSisik = bersisik ? "Bersisik" : " tidak bersisik";
        System.out.println("Ini adalah reptil " + getJenis() + " yang " + keadaanSisik);
        System.out.println("Usia: " + this.getUsia() + " Tahun");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan ("Singa", 5);
        
        System.out.println("Jenis hewan1: " +hewan1.getJenis());
        System.out.println("Usia hewan1: " +hewan1.getUsia());

        System.out.println();
        Hewan hewan2 = new Hewan("Kucing", -1);
        hewan2.setUsia(3);
        hewan2.periksaKesehatan(true);

        Mamalia mamalia = new Mamalia("Gajah",10, "Hutan");
        Reptil reptil = new Reptil("Buaya", 8, true);

        System.out.println();
        Hewan[] hewans = { mamalia, reptil };
        for (Hewan hewan : hewans) {
            System.out.println("----------------");
            hewan.tampilkanInfo();
        }
        System.out.println("----------------");
    }
}
