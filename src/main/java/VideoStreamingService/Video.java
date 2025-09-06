package VideoStreamingService;

public abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public String getInfo(String videoType) {
        System.out.println("\n--------" + videoType + "--------");
        return "Title: " + getTitle() + "\nDuration: " + getDuration();
    }
}
