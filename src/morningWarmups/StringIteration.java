package morningWarmups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringIteration {
    public static void main(String[] args) {
        String[] stringArray = {"First String", "Dinosaur", "Dracula is a vampire.", "Fourth String", "Do you believe in love after life"};
        ArrayList<String> newArrayList = new ArrayList<>();

        for(String str : stringArray) {
            newArrayList.add(str);
        }
        for(String ALstr : newArrayList) {
            System.out.println(ALstr);
        }

        HashMap<Integer, String> newHashMap = new HashMap<>();
        for(int i=0;i<5;i++) {
            newHashMap.put(i, newArrayList.get(i));
        }

        for(int i=0;i<newHashMap.size();i++) {
            System.out.println(newHashMap.get(i));
        }

        String[] toBePutIn = new String[newArrayList.size()];
        for(int i=0;i<newArrayList.size();i++) {
            toBePutIn[i] = newArrayList.get(i);
            System.out.println(toBePutIn[i]);
        }

    }
}
