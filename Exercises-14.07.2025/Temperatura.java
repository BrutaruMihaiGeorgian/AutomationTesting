public class Temperatura {
    public static double converteste(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double c = 25;
        double f = Temperatura.converteste(c);
        System.out.println("Temperatura în Fahrenheit: " + f);
    }
}
