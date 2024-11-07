import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Inheritance says Adventure is a type of Movie, a Subclass. So it will compile
        // The method that gets run is determined by the JVM based on the runtime Object
        // and not the variable type
        Movie theMovie = new ScienceFiction("Interstellar");
        theMovie.watchMovie();


        // The static method on class Movie, is calling the getMovie method on the class 'Racing'.
        // This is because the switch statement in class Movie created a new runtime of type `Racing`
        // and executed the method found on class `Racing`
        // Cool stuff!!!
        Movie theFastAndFurious = Movie.getMovie("Racing", "The Fast & Furious");
        theFastAndFurious.watchMovie();

        Movie adventureTime = Movie.getMovie("Adventure", "Adventure Time");
        adventureTime.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter Type ('A' for Adventure, 'R' for Racing," +
                    " 'S' for Science Fiction, or 'Q' to quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie Title");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }

    }

}
