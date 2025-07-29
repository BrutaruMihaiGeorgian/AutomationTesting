public class Array {
    public static int sumaPare(int[] numere) {
        int suma = 0;
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 2 == 0) {
                suma += numere[i];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] valori = {1, 2, 3, 4, 5, 6};
        int suma = sumaPare(valori);
        System.out.println("Suma numerelor pare este: " + suma);
    }
}
