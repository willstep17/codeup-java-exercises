import java.util.Date;

public class Car {
    static int carsOutThere = 0;
    public String make;
    public String model;
    public int year;
    public int mileage;
    private Date lastOilChange;
    private boolean running;

    public Car(String inputMake, String inputModel, int inputYear) {
        carsOutThere++;
        this.make = inputMake;
        this.model = inputModel;
        this.year = inputYear;
        this.mileage = 0;
        this.lastOilChange = new Date();
        this.running = false;
    }

    public String startYourEngine(String key) {
        if (key.toLowerCase().equals("correct")) {
            this.running = true;
            return "Vrooom!";
        } else {
            return "...";
        }
    }

    public String drive() {
        if(this.running) {
            this.mileage += 100;
            return "Vrooooom.";
        } else {
            return "...";
        }
    }
}
