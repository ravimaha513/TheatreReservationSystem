import java.time.LocalTime;
import java.util.Date;

public class Movie {

    // Movie: Name, Date, Time, Genre

    String movieName;
    Date movieDate;
    LocalTime movieTime;
    String movieGenre;

    public Movie(String movieName, Date movieDate, LocalTime movieTime, String movieGenre) {
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.movieGenre = movieGenre;
    }

    

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }

    public LocalTime getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(LocalTime movieTime) {
        this.movieTime = movieTime;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieDate=" + movieDate +
                ", movieTime=" + movieTime +
                ", movieGenre='" + movieGenre + '\'' +
                '}';
    }
}
