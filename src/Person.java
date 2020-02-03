public class Person {
    private String name;
    private int age;

    public Person(String inputName, int inputAge) {
        this.name = inputName;
        this.age = inputAge;
    }

    public Person(String inputName) {
        this.name = inputName;
    }

    public Person() { }

    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public int getAge() { return this.age; }

    public void setAge(int inputAge) { this.age = inputAge; }

    public void sayHello() {
        System.out.println(this.name + " says hello!");
    }
}
