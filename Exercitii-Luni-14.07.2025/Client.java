public class Client {
    String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public String mesajBunVenit() {
        return "Bun venit, " + nume + "!";
    }

    public static void main(String[] args) {
        Client client = new Client("Andrei");
        System.out.println(client.mesajBunVenit());
    }
}
