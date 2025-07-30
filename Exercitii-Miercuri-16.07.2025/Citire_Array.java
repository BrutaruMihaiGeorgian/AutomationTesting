import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Citire_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introdu numărul de elemente (n): ");
        int n = scanner.nextInt();


        int[] arr = new int[n];
        System.out.println("Introdu cele " + n + " numere:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        Map<Integer, Integer> frecvente = new HashMap<>();

        for (int num : arr) {
            frecvente.put(num, frecvente.getOrDefault(num, 0) + 1);
        }


        int maxNumar = arr[0];
        int maxFrecventa = 0;

        for (Map.Entry<Integer, Integer> entry : frecvente.entrySet()) {
            if (entry.getValue() > maxFrecventa) {
                maxFrecventa = entry.getValue();
                maxNumar = entry.getKey();
            }
        }


        System.out.println("Numărul cu cea mai mare frecvență: " + maxNumar);
        System.out.println("Apare de " + maxFrecventa + " ori.");

        scanner.close();
    }
}
