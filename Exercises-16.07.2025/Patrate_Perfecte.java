import java.util.Scanner;

public class Patrate_Perfecte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introdu un număr întreg N: ");
        int N = scanner.nextInt();


        System.out.println("Pătratele perfecte mai mici sau egale cu " + N + " sunt:");
        int i = 1;
        while (i * i <= N) {
            System.out.println(i * i);
            i++;
        }

        scanner.close();
    }
}
