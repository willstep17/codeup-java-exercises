package movies;

import util.Input;
import movies.MoviesArray;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        MoviesArray movies = new MoviesArray();
        Movie[] movieArray = movies.findAll();

        int category = -1;

        while(true) {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - Exit");
            System.out.println("1 - View All Movies");
            System.out.println("2 - View Movies in the Animated Category");
            System.out.println("3 - View Movies in the Drama Category");
            System.out.println("4 - View Movies in the Horror Category");
            System.out.println("5 - View Movies in the SciFi Category\n");
            category = input.getInt("Enter Your Choice: ");
            switch(category) {
                case 0:
                    return;
                case 1:
                    for(Movie movie : movieArray) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    for(Movie movie : movieArray) {
                        if(movie.getCategory() == "animated")
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 3:
                    for(Movie movie : movieArray) {
                        if(movie.getCategory() == "drama")
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 4:
                    for(Movie movie : movieArray) {
                        if(movie.getCategory() == "horror")
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 5:
                    for(Movie movie : movieArray) {
                        if(movie.getCategory() == "scifi")
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
            }
        }
    }

}
