public class NextMain {

    public static void main(String[] args) {

        // These two lines of code below are important to understand. This is because,
        // this code uses a single Compile Time Type of Movie, actually supports
        // four different runtime types.
        Movie movie = Movie.getMovie("A","Frogger");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "JAws");
        jaws.watchMovie();

        // casting reference types with data types
        Object race = Movie.getMovie("R", "Cannonball Run");
        Racing raceMovie = (Racing) race;
        raceMovie.watchRacing();

        var grand = Movie.getMovie("R", "Grand");
        grand.watchMovie();

        var fast = new Racing("Fast & Furious");
        fast.watchRacing();

    }

}
