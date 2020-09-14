package animals;

public class Cat extends Mammal {
    public Cat(char inputGender, int inputNumberOfAppendages) {
        super(inputGender, inputNumberOfAppendages, "Plains", "Herbivore");
    }

    public void eat() {
        System.out.println("UWU *nom*");
    }
}
