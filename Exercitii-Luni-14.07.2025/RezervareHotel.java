public class RezervareHotel {
    String numeClient;
    String tipCamera;

    public RezervareHotel(String numeClient) {
        this.numeClient = numeClient;
        this.tipCamera = "Standard";
        afiseazaDetalii();
    }

    public RezervareHotel(String numeClient, String tipCamera) {
        this.numeClient = numeClient;
        this.tipCamera = tipCamera;
        afiseazaDetalii();
    }

    public void afiseazaDetalii() {
        System.out.println("Rezervare pentru: " + numeClient);
        System.out.println("Tip cameră: " + tipCamera);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        RezervareHotel rezervare1 = new RezervareHotel("Maria Popescu");
        RezervareHotel rezervare2 = new RezervareHotel("Andrei Ionescu", "Deluxe");
    }
}
