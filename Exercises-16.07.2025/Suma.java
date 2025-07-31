import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introdu un număr: ");
        int numar = scanner.nextInt();

        int sumaPare = 0;
        int sumaImpare = 0;

        int copie = Math.abs(numar);


        while (copie > 0) {
            int cifra = copie % 10;

            if (cifra % 2 == 0) {
                sumaPare += cifra;
            } else {
                sumaImpare += cifra;
            }

            copie /= 10;
        }


        System.out.println("Suma cifrelor pare: " + sumaPare);
        System.out.println("Suma cifrelor impare: " + sumaImpare);

        scanner.close();
    }
}
