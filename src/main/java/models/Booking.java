package models;

import resources.BookingStatus;
import resources.IdGenerator;

import java.util.List;

public class Booking {
    private Integer id;
    private Integer userId;
    private Show show;
    private List<Seat> seats;

    public Integer getId() {
        return id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    private BookingStatus bookingStatus;

    public Booking(Integer userId, Show show, List<Seat> seats) {
        this.id = IdGenerator.generateId();
        this.userId = userId;
        this.show = show;
        this.seats = seats;
        this.bookingStatus = BookingStatus.CREATED;
    }

    public boolean isConfirmed()
    {
        return this.bookingStatus == BookingStatus.CONFIRMED;
    }

    public void confirmBooking() throws Exception {
        if(this.bookingStatus!=BookingStatus.CREATED)
        {
            throw new Exception("Can't be confirmed");
        }
        this.bookingStatus = BookingStatus.CONFIRMED;
    }

    public void expireBooking() throws Exception {
        if(this.bookingStatus!=BookingStatus.CREATED)
        {
            throw new Exception("Can't be confirmed");
        }
        this.bookingStatus = BookingStatus.EXPIRED;
    }
}