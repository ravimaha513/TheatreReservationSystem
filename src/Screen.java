public class Screen {
    String screenNumber;
    String moviePlaying;

    public Screen(String screenNumber, String moviePlaying) {
        this.screenNumber = screenNumber;
        this.moviePlaying = moviePlaying;
    }

    public String getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(String screenNumber) {
        this.screenNumber = screenNumber;
    }

    public String getMoviePlaying() {
        return moviePlaying;
    }

    public void setMoviePlaying(String moviePlaying) {
        this.moviePlaying = moviePlaying;
    }
}
