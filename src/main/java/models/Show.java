package models;

import resources.IdGenerator;

public class Show {
    private Integer showId;
    private Movie movie;
    private Integer starttime;
    private Integer duration;
    private Screen screen;

    public Screen getScreen() {
        return screen;
    }

    public Show(Movie movie, Integer starttime, Integer duration, Screen screen) {
        this.showId = IdGenerator.generateId();
        this.movie = movie;
        this.starttime = starttime;
        this.duration = duration;
        this.screen = screen;
    }
}