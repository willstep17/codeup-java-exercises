package animals;

public class AsianSmallClawedOtter extends Otter {
    public AsianSmallClawedOtter(char inputGender, int inputNumberOfAppendages) {
        super(inputGender, inputNumberOfAppendages);
    }

    public void eat() {
        System.out.println("AsianSmallClawedOtter is eating.");
    }

    public void swim() {
        System.out.println("I am a eurasianOtter and I'm swimming");
    }
}
