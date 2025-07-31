public class Angajat {
    String nume;
    String functie;
    double salariu;

    public Angajat(String nume, String functie, double salariu) {
        this.nume = nume;
        this.functie = functie;
        this.salariu = salariu;
    }

    public void calculeazaBonus() {
        double bonus;
        if (functie.equalsIgnoreCase("Manager")) {
            bonus = salariu * 0.10;
        } else {
            bonus = salariu * 0.05;
        }
        double salariuTotal = salariu + bonus;
        System.out.println("Angajat: " + nume);
        System.out.println("Functie: " + functie);
        System.out.println("Salariu de bază: " + salariu + " lei");
        System.out.println("Bonus: " + bonus + " lei");
        System.out.println("Salariu total: " + salariuTotal + " lei");
    }

    public static void main(String[] args) {
        Angajat angajat1 = new Angajat("Ana Popescu", "Manager", 8000.0);
        Angajat angajat2 = new Angajat("Ion Ionescu", "Programator", 7000.0);

        angajat1.calculeazaBonus();
        System.out.println();
        angajat2.calculeazaBonus();
    }
}
