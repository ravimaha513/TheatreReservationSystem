import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {

    /*
    pickAMovie();
    pickTheatre();

    selectASeat();
    makePayment();
    reserved(); //Booking Confirmation
     */
    Theatre theatres;


    public ReservationSystem(Theatre theatres) {
        this.theatres = theatres;
    }

    public Theatre pickTheatre(String name){
        if(name.equals(theatres.getTheatreName())){
            return theatres;
        }
       else{
            System.out.println("Theatre is not found");
           return null;
        }
    }

    public Movie pickMovie(String movieName){
        List<Movie> moviesList = new ArrayList();
        moviesList = theatres.getMoviesPlaying();

        for(Movie m : moviesList){
            if(m.getMovieName().equals(movieName)){
                return m;
            }
        }
        return null;
    }

    public void selectSeats(int numberofSeats){

        int availableSeats = theatres.getTotalNumberofSeats();
        System.out.println("Available Seats" + availableSeats);
        //you can only book 6 tickets at once

        //3 .. 4
        if(availableSeats < numberofSeats){
            System.out.println("Seats cannot be booked more than: "+ availableSeats);
        }

        else if(numberofSeats <= 6 &&  availableSeats > 0 || numberofSeats == availableSeats){

                theatres.setTotalNumberofSeats(theatres.getTotalNumberofSeats() - numberofSeats);
        }

        else if(numberofSeats > 6){
            System.out.println("Can only book 6 at once");
        }
        else{
            System.out.println("Cannot reserve");
        }


    }


    public boolean makePayment(){
        return true;
    }

    public void reservationConfirmation(int numberofSeats){
        System.out.println("reservation successful "+numberofSeats + " booked");
    }


}
