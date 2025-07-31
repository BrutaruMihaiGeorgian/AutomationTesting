public class Vehicul {
    int vitezaMaxima;

    public Vehicul(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }
}

class Masina extends Vehicul {
    String marca;

    public Masina(int vitezaMaxima, String marca) {
        super(vitezaMaxima); // apelează constructorul clasei de bază
        this.marca = marca;  // setează atributul propriu
    }

    public void afiseazaDetalii() {
        System.out.println("Marca: " + marca);
        System.out.println("Viteza maximă: " + vitezaMaxima + " km/h");
    }

    public static void main(String[] args) {
        Masina masina1 = new Masina(220, "BMW");
        masina1.afiseazaDetalii();
    }
}
