package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {


    public static Movie[] addMovie(Movie[] movieArray, Movie newMovie) {
        movieArray = Arrays.copyOf(movieArray, movieArray.length + 1);
        movieArray[movieArray.length - 1] = newMovie;
        return movieArray;
    }

    public static void main(String[] args) {
        Input in = new Input();
        Movie[] newMovies = MoviesArray.findAll();
        System.out.println();
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add movie\n");

        int userInput = in.getInt(0, 6);

        while (true) {
            if (userInput == 0) {
                System.out.println("See you later");
                System.exit(0);
            } else if (userInput == 1) {
                System.out.println("Here are all the movies");
                for (Movie movie : newMovies) {
                    System.out.println(movie.getName() + " " + movie.getCategory());
                }
            } else if (userInput == 2) {
                System.out.println("Here are all the animated movies");
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("animated"))
                        System.out.println(movie.getName() + ": " + movie.getCategory());

                }

            } else if (userInput == 3) {
                System.out.println("Here are all the drama movies");
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("drama"))
                        System.out.println(movie.getName() + ": " + movie.getCategory());
                }
            } else if (userInput == 4) {
                System.out.println("Here are all the horror movies");
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("horror"))
                        System.out.println(movie.getName() + ": " + movie.getCategory());
                }
            } else if (userInput == 5) {
                System.out.println("Here are all the scifi movies");
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("scifi"))
                        System.out.println(movie.getName() + ": " + movie.getCategory());
                }
            } else if (userInput == 6) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter movie title \n");
                String input1 = sc.next();
                System.out.println("Enter movie category \n");
                String input2 = sc.next();
                Movie newMovie = new Movie(input1, input2);
                newMovies = addMovie(newMovies, newMovie);
            }
//           movie();
            System.out.println();
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add movie\n");

            userInput = in.getInt(0, 6);
        }
    }

}
