package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("FirstString");
//        strings.add(0, "NewFirstString");
//        System.out.println(strings); //Prints the ArrayList
//
//        int[] iVals = {1, 2, 3, 4, 5};
//        System.out.println(iVals); //Prints the location in memory
//
//        HashMap<Integer, String> firstHash = new HashMap<Integer, String>();
//        firstHash.put(3, "Duck");
//        firstHash.put(1, "Dog");
//        firstHash.put(2, "Cat");
//        System.out.println(firstHash.containsValue("Duck"));
//        System.out.println(firstHash.containsKey(4));
//        System.out.println(firstHash.get(3));
//        System.out.println(firstHash);
//
//        HashMap<String, String> emailList = new HashMap<>();
//        emailList.put("Matt", "mattstephens@gmail.com");
//        emailList.put("Will", "willstep17@gmail.com");
//        emailList.put("Charles", "charles@gmail.com");
//        System.out.println("The email of Matt is: " + emailList.get("Matt"));
//        System.out.println("The email of Charles is: " + emailList.getOrDefault("Will", "not found"));
//        System.out.println("The email of Sam is: " + emailList.getOrDefault("Sam", "not found"));
//        emailList.remove("Matt");
//
        HashMap<Integer, String> apartmentResidents = new HashMap<>();
        apartmentResidents.put(1, "First Resident");
        apartmentResidents.put(2, "Second Resident");
        apartmentResidents.put(3, "Third Resident");

//        System.out.println(apartmentResidents.remove(new Integer(1)));
        System.out.println(apartmentResidents.remove(1));

        HashMap<String, Boolean> attendance = new HashMap<>();

    }
}
