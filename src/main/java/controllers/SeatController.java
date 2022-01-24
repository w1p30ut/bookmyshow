package controllers;

import models.*;
import services.TheatreService;

import java.util.List;

public class SeatController {
    private TheatreService theatreService;
    public static List<Seat> getAvailableSeats(Show show) {
        Screen s = show.getScreen();
        return s.getSeats();
    }

    public void markAvailable(Seat s) {
        this.theatreService.markAvailable(s);
    }
}
