package booking;

import java.util.ArrayList;

public class TicketBookingBuilder {
    private TicketBooking ticketBooking;

    public TicketBookingBuilder() {
        ticketBooking = new TicketBooking();
    }

    public TicketBookingBuilder setMovieTitle(String movieTitle) {
        ticketBooking.setMovieTitle(movieTitle);
        return this;
    }

    public TicketBookingBuilder setSeatNumber(String seatNumber) {
        ticketBooking.setSeatNumber(seatNumber);
        return this;
    }

    public TicketBookingBuilder addSnackCombo(String snackCombo) {
        if (ticketBooking.getSnackCombos() == null) {
            ticketBooking.setSnackCombos(new ArrayList<>());
        }
        ticketBooking.getSnackCombos().add(snackCombo);
        return this;
    }

    public TicketBooking build() {
        return ticketBooking;
    }
}
