package animals;

public abstract class Animal {
    protected char gender;
    protected int numberOfAppendages;
    protected String habitat;
    protected String diet;


    public Animal(char inputGender, int inputNumberOfAppendages, String inputHabitat, String inputDiet) {
        this.gender = inputGender;
        this.numberOfAppendages = inputNumberOfAppendages;
        this.habitat = inputHabitat;
        this.diet = inputDiet;
    }

    public abstract void eat();

    public char getGender() {
        return this.gender;
    }

    public int getNumberOfAppendages() {
        return this.numberOfAppendages;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public String getDiet() { return this.diet; }

    public void setGender(char inputGender) {
        this.gender = inputGender;
    }
}
