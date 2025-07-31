public class CategorieVarsta {
    public static String verificaCategorieVarsta(int varsta) {
        if (varsta >= 0 && varsta <= 12) {
            return "Copil";
        } else if (varsta >= 13 && varsta <= 17) {
            return "Adolescent";
        } else if (varsta >= 18 && varsta <= 64) {
            return "Adult";
        } else if (varsta >= 65) {
            return "Senior";
        } else {
            return "Vârstă invalidă";
        }
    }

    public static void main(String[] args) {
        System.out.println(verificaCategorieVarsta(10));  // Copil
        System.out.println(verificaCategorieVarsta(15));  // Adolescent
        System.out.println(verificaCategorieVarsta(30));  // Adult
        System.out.println(verificaCategorieVarsta(70));  // Senior
        System.out.println(verificaCategorieVarsta(-5));  // Vârstă invalidă
    }
}
