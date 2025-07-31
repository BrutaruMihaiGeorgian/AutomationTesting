
public class Factura {
        String nrFactura;
        double valoare;
        String data;

        public Factura(String nrFactura, double valoare, String data) {
            this.nrFactura = nrFactura;
            this.valoare = valoare;
            this.data = data;
        }

        public void afiseazaFactura() {
            System.out.println("Număr factură: " + nrFactura);
            System.out.println("Valoare: " + valoare + " lei");
            System.out.println("Data: " + data);
        }

        public static void main(String[] args) {
            Factura factura1 = new Factura("F123", 1250.20, "14.07.2025");
            factura1.afiseazaFactura();
        }
    }


