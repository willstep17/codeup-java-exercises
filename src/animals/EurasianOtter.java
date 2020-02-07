package animals;

public class EurasianOtter extends Otter {
    public EurasianOtter(char inputGender, int inputNumberOfAppendages) {
        super(inputGender, inputNumberOfAppendages);
    }

    public void swim() {
        System.out.println("I am a eurasianOtter and I'm swimming");
    }
}
