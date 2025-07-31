import java.util.Scanner;

public class TriunghiValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introdu latura a: ");
        int a = scanner.nextInt();

        System.out.print("Introdu latura b: ");
        int b = scanner.nextInt();

        System.out.print("Introdu latura c: ");
        int c = scanner.nextInt();


        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("✅ Cele 3 laturi pot forma un triunghi valid.");
        } else {
            System.out.println("Cele 3 laturi NU pot forma un triunghi valid.");
        }

        scanner.close();
    }
}
