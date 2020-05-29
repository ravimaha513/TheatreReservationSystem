import java.util.ArrayList;

public class Theatre {

    // Theatre: Theatre Name,Total Number of seats, No of seats available, Screen Number

    String theatreName;
    int totalNumberofSeats;
    ArrayList<Movie> moviesPlaying;



    public Theatre(String theatreName, int totalNumberofSeats, ArrayList<Movie> moviesPlaying) {
        this.theatreName = theatreName;
        this.totalNumberofSeats = totalNumberofSeats;
        this.moviesPlaying = moviesPlaying;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public int getTotalNumberofSeats() {
        return totalNumberofSeats;
    }

    public void setTotalNumberofSeats(int totalNumberofSeats) {
        this.totalNumberofSeats = totalNumberofSeats;
    }

    public ArrayList<Movie> getMoviesPlaying() {
        return moviesPlaying;
    }

    public void setMoviesPlaying(ArrayList<Movie> moviesPlaying) {
        this.moviesPlaying = moviesPlaying;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreName='" + theatreName + '\'' +
                ", totalNumberofSeats=" + totalNumberofSeats +
                ", moviesPlaying=" + moviesPlaying +
                '}';
    }
}
