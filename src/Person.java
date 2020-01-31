public class Person {
    private String name;

    public Person(String inputName) {
        this.name = inputName;
    }

    public Person() { }

    public static void main(String[] args) {
        Person will = new Person("Will");

//        System.out.println("Return from will.getName(): " + will.getName());
//        will.setName("William");
//        will.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public void sayHello() {
        System.out.println(this.name + " says hello!");
    }
}
