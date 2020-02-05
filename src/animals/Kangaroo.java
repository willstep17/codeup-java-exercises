package animals;

public class Kangaroo extends Mammal {
    protected String diet;

    public Kangaroo(char inputGender, int inputNumberOfAppendages, String inputHabitat, String inputDiet) {
        super(inputGender, inputNumberOfAppendages, inputHabitat);
        this.diet = inputDiet;
    }

    public void eat() {
        System.out.println("The Kangaroo is eating: " + this.diet);
    }
}
