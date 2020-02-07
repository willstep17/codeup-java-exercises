package animals;

public class Zoo {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[10];
        Aquatic[] aquarium = new Aquatic[10];

        Animal firstOtter = new AsianSmallClawedOtter('M', 4);
        Aquatic secondOtter = new EurasianOtter('F', 4);
        EurasianOtter thirdOtter = new EurasianOtter('F', 4);
        Otter fourthOtter = new AsianSmallClawedOtter('M', 4);

//        aquarium[0] = firstOtter; // Fails because Animal does not implement Aquatic
        aquarium[1] = secondOtter;
        aquarium[2] = thirdOtter;
        aquarium[3] = fourthOtter;

        zoo[0] = firstOtter;
//        zoo[1] = secondOtter; // Fails because Aquatic does not extend Animal
        zoo[2] = thirdOtter;
        zoo[3] = fourthOtter;

        EasternGreyKangaroo firstKangaroo = new EasternGreyKangaroo('M', 4);




    }
}
