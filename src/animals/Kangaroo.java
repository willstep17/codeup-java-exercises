package animals;

public abstract class Kangaroo extends Mammal {

    public Kangaroo(char inputGender, int inputNumberOfAppendages) {
        super(inputGender, inputNumberOfAppendages, "Plains", "Herbivore");
    }

    public void eat() {
        System.out.println("The Kangaroo is eating: " + this.diet);
    }
}
