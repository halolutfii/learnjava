public class Polimorfisme {
    class Hewan {
        void suara() {
            System.out.println("Hewan mengeluarkan suara");
        }
    }

    class Kucing extends Hewan {
        @Override
        void suara() {
            System.out.println("Meong!");
        }
    }

    class Sapi extends Hewan {
        @Override
        void suara() {
            System.out.println("MOOOOOOO!");
        }
    }
}
