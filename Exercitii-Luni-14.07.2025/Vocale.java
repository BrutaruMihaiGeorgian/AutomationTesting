public class Vocale {
    public static int numaraVocale(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "Exemplu de text cu vocale";
        int nrVocale = numaraVocale(text);
        System.out.println("Numărul de vocale este: " + nrVocale);
    }
}
