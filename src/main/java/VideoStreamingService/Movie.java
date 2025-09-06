package VideoStreamingService;

public class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo(String videoType) {
        System.out.println("\n--------" + videoType + "--------");
        return "Title: " + getTitle() + "\nDuration: " + getDuration() + "\nRating: " + this.rating;
    }
}
