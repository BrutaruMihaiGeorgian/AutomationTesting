public class Dispozitiv {
    public void porneste() {
        System.out.println("Dispozitivul pornește.");
    }
}

class Laptop extends Dispozitiv {
    @Override
    public void porneste() {
        System.out.println("Laptopul pornește sistemul de operare.");
    }
}

class Telefon extends Dispozitiv {
    @Override
    public void porneste() {
        System.out.println("Telefonul se aprinde și afișează ecranul de blocare.");
    }
}

class TestDispozitive {
    public static void pornesteDispozitiv(Dispozitiv d) {
        d.porneste();
    }

    public static void main(String[] args) {
        Dispozitiv d1 = new Laptop();
        Dispozitiv d2 = new Telefon();

        pornesteDispozitiv(d1);
        pornesteDispozitiv(d2);
    }
}
