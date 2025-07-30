public class Calendar {
    public static int tipZile(int luna) {
        switch (luna) {
            case 1:  // Ianuarie
            case 3:  // Martie
            case 5:  // Mai
            case 7:  // Iulie
            case 8:  // August
            case 10: // Octombrie
            case 12: // Decembrie
                return 31;
            case 4:  // Aprilie
            case 6:  // Iunie
            case 9:  // Septembrie
            case 11: // Noiembrie
                return 30;
            case 2:  // Februarie
                return 28;
            default:
                return -1; // Lună invalidă
        }
    }

    public static void main(String[] args) {
        System.out.println("Ianuarie are " + tipZile(1) + " zile.");
        System.out.println("Februarie are " + tipZile(2) + " zile.");
        System.out.println("Aprilie are " + tipZile(4) + " zile.");
        System.out.println("Luna 13 este invalidă: " + tipZile(1));
    }
}
