package VideoStreamingService;

public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo(String videoType) {
        System.out.println("\n--------" + videoType + "--------");
        return "Title: " + getTitle() + "\nDuration: " + getDuration() + "\nEpisodes: " + this.episodes;
    }
}
