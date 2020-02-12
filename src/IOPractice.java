import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;

public class IOPractice {
    public static void main(String[] args) {

    }

    public void writeFile() {
        List<String> cars = new ArrayList<>();
        cars.add("Mustang");cars.add("Range Rover");cars.add("Viper");
        try {
            Path filePath = Paths.get("data", "cars.txt");
            Files.write(filePath, cars);
            System.out.println("File created successfully,");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public List<String> readFile() {
        List<String> returnStrings = new ArrayList<>();

    }

}
