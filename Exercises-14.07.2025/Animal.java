public class Animal {
    public void faceSunet() {
        System.out.println("Animalul face un sunet.");
    }
}

class Caine extends Animal {
    @Override
    public void faceSunet() {
        System.out.println("Cainele latră: Ham ham!");
    }
}

class Pisica extends Animal {
    @Override
    public void faceSunet() {
        System.out.println("Pisica miaună: Miau miau!");
    }
}

class TestAnimale {
    public static void main(String[] args) {
        Animal[] animale = new Animal[3];
        animale[0] = new Animal();
        animale[1] = new Caine();
        animale[2] = new Pisica();

        for (int i = 0; i < animale.length; i++) {
            animale[i].faceSunet();  // polimorfism dinamic
        }
    }
}
