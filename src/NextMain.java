public class NextMain {

    public static void main(String[] args) {

        // These two lines of code below are important to understand. This is because,
        // this code uses a single Compile Time Type of Movie, actually supports
        // four different runtime types.
        Movie movie = Movie.getMovie("A","Frogger");
        movie.watchMovie();

        // Casting Class data Type
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


        Object unknownObject = Movie.getMovie("R", "Twist of The Wrist");
        // Calling getClass on the local variable reference unknownObject and returning
        // the class name with the .getSimpleName which returns the class name of any
        // instance.
        if (unknownObject.getClass().getSimpleName() == "Racing") {
            // If true, we can then cast the Racing class onto the object and call
            // any method on Racing. Without casting, we wouldn't be able to execute
            // watchRacing on the class, Racing.
            Racing r = (Racing) unknownObject;
            r.watchRacing();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            // this instanceof operator is called pattern matching support
            // if this method returns true, then syfy is already type as a ScienceFiction
            // variable.
            syfy.watchScienceFiction();
        }

    }

}
