import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class IOLecture {
    public static void main(String[] args) {
//        newFile();
//        writeFile();
//        readFile();
//        writeMovies();
        readMovies();
    }

    static void writeMovies() {
        List<String> movieList = new ArrayList<>();
        movieList.add("Parasite");movieList.add("Ghostbusters");movieList.add("From Russia with Love");
        try {
            Path moviesPath = Paths.get("data", "movies.txt");
            Files.write(moviesPath, movieList);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    static void readMovies() {
        try {
            Path moviesPath = Paths.get("data", "movies.txt");
            List<String> moviesList = Files.readAllLines(moviesPath);
            for(String movie : moviesList) {
                System.out.println(movie);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }



    static void newFile() {
        //   /Users/daniel/Code/europa-java-exercises/src/FileIOLecture.java
        //   /Users/daniel/Code/europa-java-exercises/src/FileIOLecture.class
        //   /Users/daniel/Code/europa-java-exercises/
        //   /Users/daniel/Code/europa-java-exercises/data
        String directory = "data";
        String filename = "info.txt";

        //Create Path object for directory
        Path dataDirectory = Paths.get(directory);
        //   /Users/williamstephens/IdeaProjects/codeup-java-exercises/data
        System.out.println(dataDirectory.toAbsolutePath());
        //Create Path object for file
        Path dataFile = Paths.get(directory, filename);
        //   /Users/williamstephens/IdeaProjects/codeup-java-exercises/data/into.txt
        System.out.println(dataFile.toAbsolutePath());

        try {
            //If a directory by the name "data" does not exist at Path dataDirectory, create one.
            if(Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
                System.out.println("Directory Created: " + dataDirectory);
            }
            //If a directory by the name "data" does not exist at Path dataDirectory, create one.
            if(Files.notExists(dataFile)) {
                Files.createFile(dataFile);
                System.out.println("File Created: " + dataFile);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    static void writeFile() {
        List<String> fruit = new ArrayList<>();
        fruit.add("Banana");fruit.add("Orange");fruit.add("Kiwi");fruit.add("Lemon");
//        for(String fr : fruit) {
//            System.out.println(fr);
//        }
        try {
            Path groceries = Paths.get("data", "groceries.txt");
            Files.write(groceries, fruit);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    static void readFile() {
        try {
            Path poemFile = Paths.get("europa", "poem.txt");
            List<String> poemLines = Files.readAllLines(poemFile);
            for(String line : poemLines) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
