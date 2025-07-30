public class Util {
    public static void verificaParola(String parola) {
        boolean areMinim8 = parola.length() >= 8;
        boolean areMajuscula = false;
        boolean areCaracterSpecial = false;

        for (char c : parola.toCharArray()) {
            if (Character.isUpperCase(c)) {
                areMajuscula = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                areCaracterSpecial = true;
            }
        }

        if (!areMinim8) {
            System.out.println("Parola trebuie să aibă minim 8 caractere.");
        }
        if (!areMajuscula) {
            System.out.println("Parola trebuie să conțină cel puțin o literă majusculă.");
        }
        if (!areCaracterSpecial) {
            System.out.println("Parola trebuie să conțină cel puțin un caracter special.");
        }

        if (areMinim8 && areMajuscula && areCaracterSpecial) {
            System.out.println("Parola este validă.");
        }
    }

    public static void main(String[] args) {
        verificaParola("parola1!");
        System.out.println();
        verificaParola("Parola123");
        System.out.println();
        verificaParola("Parola@2025");
    }
}
