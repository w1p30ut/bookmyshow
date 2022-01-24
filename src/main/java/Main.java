import controllers.*;
import models.*;

import java.util.List;

public class Main {
    public static void main(String args[])
    {
        User u1 = UserController.createUser(999, "a@b.com");
        User u2 = UserController.createUser(987, "a@cf.com");
        List<Show> shows = ShowController.getAvailableShows();
        List<Seat> availableSeats = SeatController.getAvailableSeats(shows.get(0));
        List<Seat> selectedSeats = availableSeats.subList(0,1);
    }
}