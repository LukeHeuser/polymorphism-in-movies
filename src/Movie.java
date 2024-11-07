public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    // This Method is known as a 'Factory Method' in Software Programming Design Patterns
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {

            case 'A' -> new Adventure(title);
            case 'R' -> new Racing(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);

        };
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
         super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Terrifying Music",
                "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}

class Racing extends Movie {

    public Racing(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Racing Scene",
                "Suspenseful Music",
                "Someone Crashes");
    }

    public void watchRacing() {
        System.out.println("Watching a Race!");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "People Lost In Space",
                "Alien Infiltrates Space Craft",
                "Ship Blows Up");
    }

    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction!");
    }
}
