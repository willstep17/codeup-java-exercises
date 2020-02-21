import java.util.ArrayList;

public class addToInt {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> hold;
        ArrayList<ArrayList<Integer>> holdTwo;
        ArrayList<Integer> sampleArray = new ArrayList<>();
        sampleArray.add(2); sampleArray.add(4); sampleArray.add(12); sampleArray.add(1); sampleArray.add(2); sampleArray.add(5);

        hold = addToInt(sampleArray, 3);
        for(ArrayList<Integer> matchList : hold) {
            System.out.print(matchList.get(0));
            System.out.println(" " + matchList.get(1));
        }
        System.out.println("");

        holdTwo = addToInt(sampleArray, 6);
        for(ArrayList<Integer> matchList : holdTwo) {
            System.out.print(matchList.get(0));
            System.out.println(" " + matchList.get(1));
        }

    }

    public static ArrayList<ArrayList<Integer>> addToInt(ArrayList<Integer> toBeMatched, int addTo) {
        ArrayList<ArrayList<Integer>> returnList = new ArrayList();
        for(int i=0;i<toBeMatched.size();i++) {
            for(int j=0;j<toBeMatched.size();j++) {
                if(toBeMatched.get(i) + toBeMatched.get(j) == addTo) {
                    ArrayList<Integer> aMatch = new ArrayList();
                    aMatch.add(i);
                    aMatch.add(j);
                    returnList.add(aMatch);
                }
            }
        }
        return returnList;
    }
}
