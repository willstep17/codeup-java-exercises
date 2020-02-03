package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movieArray = MoviesArray.findAll();

        while(true) {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - Exit");
            System.out.println("1 - View All Movies");
            System.out.println("2 - View Movies in the Animated Category");
            System.out.println("3 - View Movies in the Drama Category");
            System.out.println("4 - View Movies in the Horror Category");
            System.out.println("5 - View Movies in the SciFi Category\n");
            switch(input.getInt("Enter Your Choice: ")) {
                case 0:
                    return;
                case 1:
                    printMovies(movieArray);
                    break;
                case 2:
                    printMovies(movieArray, "animated");
                    break;
                case 3:
                    printMovies(movieArray, "drama");
                    break;
                case 4:
                    printMovies(movieArray, "horror");
                    break;
                case 5:
                    printMovies(movieArray, "scifi");
                    break;
            }
        }
    }

    public static void printMovies(Movie[] inputMovies, String inputCategory) {
        for(Movie movie : inputMovies) {
            if(movie.getCategory() == inputCategory) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void printMovies(Movie[] inputMovies) {
        for(Movie movie : inputMovies) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

}
