public class ContBancar {
    private double sold;

    public ContBancar(double soldInitial) {
        this.sold = soldInitial;
    }

    public void depunere(double suma) {
        if (suma > 0) {
            sold += suma;
            System.out.println("Ai depus " + suma + " lei.");
        } else {
            System.out.println("Suma de depunere trebuie să fie pozitivă.");
        }
    }

    public void retragere(double suma) {
        if (suma > sold) {
            System.out.println("Fonduri insuficiente! Sold curent: " + sold + " lei.");
        } else if (suma <= 0) {
            System.out.println("Suma de retras trebuie să fie pozitivă.");
        } else {
            sold -= suma;
            System.out.println("Ai retras " + suma + " lei.");
        }
    }

    public void verificaSold() {
        System.out.println("Sold curent: " + sold + " lei.");
    }

    public static void main(String[] args) {
        ContBancar cont = new ContBancar(1000.0);
        cont.verificaSold();
        cont.depunere(500.0);
        cont.retragere(200.0);
        cont.retragere(2000.0);
        cont.verificaSold();
    }
}

