package services;

import models.Screen;
import models.Seat;
import resources.SeatStatus;

import java.util.*;

public class TheatreService {
    private HashMap<Integer, List<Screen>> screenList;

    public void markAvailable(Seat s) {
        s.setSeatStatus(SeatStatus.AVAILABLE);
    }
}