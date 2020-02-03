import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"Superficial", "Radical", "Separate", "Industrious", "Astonishing", "Eastern", "Cooing", "Terrific", "Unaccountable", "Optimal", "Jolly", "Funny", "Envious", "Habitual"};
    public static String[] nouns = {"Resolution", "Potato", "Chalkboard", "Studio", "Wealth", "Energy", "Homework", "Army", "Passenger", "Penalty", "Variety", "Road", "Contract"};

    public static void main(String[] args) {
        for(int i=0;i<20;i++) {
            System.out.println(returnRandom(adjectives) + "-" + returnRandom(nouns));
        }
    }

    public static String returnRandom(String[] inputArr) {
        Random random = new Random();
        return inputArr[random.nextInt(inputArr.length - 1)];
    }

}
