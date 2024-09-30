package schedule;

import java.util.List;

public class TicketBooking {
    private String movieTitle;
    private String seatNumber;
    private List<String> snackCombos;

    // Getters and setters for movieTitle, seatNumber, snackCombos

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getSeatNumber()
    {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }


    public List<String> getSnackCombos() {
        return snackCombos;
    }

    public void setSnackCombos(List<String> snackCombos) {
        this.snackCombos = snackCombos;
    }
}
