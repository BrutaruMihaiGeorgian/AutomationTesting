import java.util.Scanner;

public class Numere_Pare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introdu un număr: ");
        int numar = scanner.nextInt();

        boolean toatePare = true;
        int copie = numar;


        while (copie > 0) {
            int cifra = copie % 10; // extragem ultima cifră
            if (cifra % 2 != 0) {   // dacă cifra este impară
                toatePare = false;
                break; // nu mai are rost să verificăm restul
            }
            copie /= 10; // eliminăm ultima cifră
        }


        if (toatePare) {
            System.out.println("Numărul " + numar + " are doar cifre pare ✅");
        } else {
            System.out.println("Numărul " + numar + " conține cel puțin o cifră impară ❌");
        }

        scanner.close();
    }
}
