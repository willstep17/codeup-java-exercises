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
        newPeople = addPerson(newPeople, new Person("Sandra"));

        System.out.println("newPeople length: " + newPeople.length);
        for(Person person : newPeople) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] inputPeople, Person newPerson) {
        Person[] returnPeople = Arrays.copyOf(inputPeople, inputPeople.length + 1);
        returnPeople[inputPeople.length] = newPerson;
        return returnPeople;
    }
}
