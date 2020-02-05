package collections;

import java.util.ArrayList;

public class CollectionsLecture {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("FirstString");
        strings.add(0, "NewFirstString");
        System.out.println(strings); //Prints the ArrayList

        int[] iVals = {1, 2, 3, 4, 5};
        System.out.println(iVals); //Prints the location in memory


    }
}
