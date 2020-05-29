import java.time.Instant;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

       Movie movie1 = new Movie("Avengers", Date.from(Instant.now()), LocalTime.now(), "Action");
       Movie movie2 = new Movie("Avengers-Part1", Date.from(Instant.now()), LocalTime.now(), "Action");
       Movie movie3 = new Movie("Avengers-Part2", Date.from(Instant.now()), LocalTime.now(), "Action");
       Movie movie4 = new Movie("Avengers-Part3", Date.from(Instant.now()), LocalTime.now(), "Action");

       ArrayList<Movie> moviesList = new ArrayList<>();
       moviesList.add(movie1);
       moviesList.add(movie2);
       moviesList.add(movie3);
       moviesList.add(movie4);

       Theatre amcTheatre = new Theatre("AMC", 10, moviesList);

       ReservationSystem reservationSystem = new ReservationSystem(amcTheatre);

     //  System.out.println(amcTheatre);

       reservationSystem.pickTheatre("AMC");
       reservationSystem.pickMovie("Avengers");
       reservationSystem.selectSeats(6);
       reservationSystem.selectSeats(4);
       reservationSystem.makePayment();
       reservationSystem.reservationConfirmation(6);
       System.out.println(reservationSystem.theatres.totalNumberofSeats);


    }
}
