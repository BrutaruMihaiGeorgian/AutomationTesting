public class Produs {
    final String codProdus;

    public Produs(String codProdus) {
        this.codProdus = codProdus;
    }

    public void afiseazaDetalii() {
        System.out.println("Cod produs: " + codProdus);
    }

    public static void main(String[] args) {
        Produs p = new Produs("ABC123");
        p.afiseazaDetalii();

        // Următoarea linie generează eroare de compilare:
        // p.codProdus = "XYZ789"; // Eroare: cannot assign a value to final variable 'codProdus'
    }
}
