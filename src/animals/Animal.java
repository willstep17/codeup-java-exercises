package animals;

public class Animal {
    protected char gender;
    protected int numberOfAppendages;
    protected String habitat;


    public Animal(char inputGender, int inputNumberOfAppendages, String inputHabitat) {
        this.gender = inputGender;
        this.numberOfAppendages = inputNumberOfAppendages;
        this.habitat = inputHabitat;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public int getNumberOfAppendages() {
        return this.numberOfAppendages;
    }

    public char getGender() {
        return this.gender;
    }

}
