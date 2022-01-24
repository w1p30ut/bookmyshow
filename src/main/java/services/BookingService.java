package services;

import controllers.SeatController;
import models.Booking;
import models.Seat;
import models.Show;

import java.util.HashMap;
import java.util.List;

public class BookingService {
    private HashMap<Integer, Booking> bookingHashMap;
    public Booking initiateBooking(Integer userId, Show show, List<Seat> seats)
    {
        Booking b = new Booking(userId, show, seats);
        this.bookingHashMap.put(b.getId(), b);
        return b;
    }

    public void confirmBooking(Booking booking) throws Exception {
        List<Seat> seats = booking.getSeats();
        for (Seat s: seats) {
            if(!s.isAvailable())
            {
                throw new Exception("One of these seats is no longer available");
            }
        }
        booking.confirmBooking();
    }

    public void cancelBooking(Booking booking) throws Exception {
        List<Seat> seats = booking.getSeats();
        for (Seat s: seats) {
            if(!s.isAvailable())
            {
                SeatController.markAvailable(s);
            }
        }
        booking.expireBooking();
    }
}
