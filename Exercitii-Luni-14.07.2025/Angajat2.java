public class Angajat2 {
    public void afiseazaFunctie() {
        System.out.println("Funcție generală");
    }
}

class Programator extends Angajat2 {
    @Override
    public void afiseazaFunctie() {
        System.out.println("Sunt Programator");
    }
}

class Tester extends Angajat2 {
    @Override
    public void afiseazaFunctie() {
        System.out.println("Sunt Tester");
    }
}

class Main {
    public static void main(String[] args) {
        Angajat2[] angajati = new Angajat2[3];
        angajati[0] = new Angajat2();
        angajati[1] = new Programator();
        angajati[2] = new Tester();

        for (Angajat2 a : angajati) {
            a.afiseazaFunctie();
        }
    }
}
