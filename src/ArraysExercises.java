import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = {
                new Person("John"),
                new Person("Sam"),
                new Person("Carl")
        };

        System.out.println("people length: " + people.length);
        for(Person person : people) {
            System.out.println(person.getName());
        }

        Person[] newPeople = addPerson(people, new Person("Ted"));

        System.out.println("newPeople length: " + newPeople.length);
        for(Person person : newPeople) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] inputPeople, Person newPerson) {
        Person[] returnPeople = new Person[inputPeople.length + 1];
        for(int i=0;i<inputPeople.length;i++) {
            returnPeople[i] = inputPeople[i];
        }
        returnPeople[inputPeople.length] = newPerson;
        return returnPeople;
    }
}
