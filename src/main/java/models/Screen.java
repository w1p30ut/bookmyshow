package models;

import java.util.List;

public class Screen {
    private Theatre theatre;
    private List<Seat> seats;

    public List<Seat> getSeats() {
        return seats;
    }

    public Screen(Theatre theatre, List<Seat> seats) {
        this.theatre = theatre;
        this.seats = seats;
    }
}