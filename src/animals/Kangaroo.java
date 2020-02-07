package animals;

public class Kangaroo extends Mammal {

    public Kangaroo(char inputGender, int inputNumberOfAppendages, String inputHabitat, String inputDiet) {
        super(inputGender, inputNumberOfAppendages, inputHabitat, inputDiet);
    }

    public void eat() {
        System.out.println("The Kangaroo is eating: " + this.diet);
    }
}
