import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;

public class IOPractice {
    public static void main(String[] args) {
        writeFile();
        List<String> cars = readFile();
        for(String str : cars) {
            System.out.println(str);
        }
    }

    public static void writeFile() {
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

    public static List<String> readFile() {
        List<String> returnStrings = new ArrayList<>();
        try {
            Path cars = Paths.get("data", "cars.txt");
            returnStrings = Files.readAllLines(cars);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return returnStrings;
    }

}
