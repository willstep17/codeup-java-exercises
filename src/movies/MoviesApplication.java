package movies;

import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        Movie[] movieArray = MoviesArray.findAll();

        while(true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("0 - Exit");
            System.out.println("1 - Add a Movie");
            System.out.println("2 - View All Movies");
            System.out.println("3 - View Movies in the Animated Category");
            System.out.println("4 - View Movies in the Drama Category");
            System.out.println("5 - View Movies in the Horror Category");
            System.out.println("6 - View Movies in the SciFi Category");
            System.out.println("7 - View Movies in the Musical Category");
            System.out.println("8 - View Movies in the Comedy Category");
            switch(input.getInt("Enter Your Choice: ")) {
                case 0:
                    return;
                case 1:
                    System.out.print("Enter a Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter a Category: ");
                    String category = scanner.nextLine();
                    movieArray = addMovie(movieArray, name, category);
                    break;
                case 2:
                    printMovies(movieArray);
                    break;
                case 3:
                    printMovies(movieArray, "animated");
                    break;
                case 4:
                    printMovies(movieArray, "drama");
                    break;
                case 5:
                    printMovies(movieArray, "horror");
                    break;
                case 6:
                    printMovies(movieArray, "scifi");
                    break;
                case 7:
                    printMovies(movieArray, "musical");
                    break;
                case 8:
                    printMovies(movieArray, "comedy");
                    break;
                default:
                    break;
            }
        }
    }

    public static void printMovies(Movie[] inputMovies, String inputCategory) {
        for(Movie movie : inputMovies) {
            if(movie.getCategory().equals(inputCategory)) {
                System.out.println(movie.getName() + " -- " + capitalize(movie.getCategory()));
            }
        }
    }

    public static void printMovies(Movie[] inputMovies) {
        for(Movie movie : inputMovies) {
                System.out.println(movie.getName() + " -- " + capitalize(movie.getCategory()));
        }
    }

    public static Movie[] addMovie(Movie[] inputMovies, String newMovieName, String newMovieCategory) {
        Movie[] returnMovies = Arrays.copyOf(inputMovies, inputMovies.length + 1);
        Movie newMovie = new Movie(newMovieName, newMovieCategory);
        returnMovies[inputMovies.length] = newMovie;
        return returnMovies;
    }

    public static String capitalize(String inputString) {
        String firstLetter = inputString.substring(0, 1).toUpperCase();
        return firstLetter + inputString.substring(1);
    }

}
