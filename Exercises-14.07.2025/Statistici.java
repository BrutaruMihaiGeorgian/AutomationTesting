public class Statistici {
    public static double mediaPozitivelor(int[] valori) {
        int suma = 0;
        int count = 0;

        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > 0) {
                suma += valori[i];
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return (double) suma / count;
    }

    public static void main(String[] args) {
        int[] numere = {4, -2, 7, 0, -5, 10};
        double media = mediaPozitivelor(numere);
        System.out.println("Media numerelor pozitive este: " + media);
    }
}
