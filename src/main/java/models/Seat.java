package models;

import resources.IdGenerator;
import resources.SeatStatus;

public class Seat {
    private Integer id;
    private int seatNo;
    private SeatStatus seatStatus;
    public Seat(int seatNo)
    {
        this.id = IdGenerator.generateId();
        this.seatNo = seatNo;
        this.seatStatus = SeatStatus.AVAILABLE;
    }

    public boolean isAvailable()
    {
        return this.seatStatus == SeatStatus.AVAILABLE;
    }

    public void setSeatStatus(SeatStatus s) {
        this.seatStatus = s;
    }
}