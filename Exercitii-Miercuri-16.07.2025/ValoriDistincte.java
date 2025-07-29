import java.util.Scanner;
import java.util.HashSet;

public class ValoriDistincte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Citim dimensiunea array-ului
        System.out.print("Introdu numărul de elemente (n): ");
        int n = scanner.nextInt();

        // 2. Citim elementele într-un array
        int[] arr = new int[n];
        System.out.println("Introdu cele " + n + " numere:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Folosim un HashSet pentru a elimina duplicatele
        HashSet<Integer> distincte = new HashSet<>();
        for (int num : arr) {
            distincte.add(num);
        }

        // 4. Afișăm valorile distincte
        System.out.println("Valorile distincte sunt:");
        for (int num : distincte) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
