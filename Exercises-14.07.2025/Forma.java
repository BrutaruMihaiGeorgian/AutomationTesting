public class Forma {
    public double aria() {
        return 0;
    }
}

class Cerc extends Forma {
    double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public double aria() {
        return Math.PI * raza * raza;
    }
}

class Dreptunghi extends Forma {
    double lungime;
    double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public double aria() {
        return lungime * latime;
    }
}

class TestForme {
    public static void main(String[] args) {
        Forma[] forme = new Forma[3];
        forme[0] = new Forma();               // bază
        forme[1] = new Cerc(3);               // aria = π * r²
        forme[2] = new Dreptunghi(4, 5);      // aria = l * L

        for (int i = 0; i < forme.length; i++) {
            System.out.println("Aria formei " + (i + 1) + " este: " + forme[i].aria());
        }
    }
}
