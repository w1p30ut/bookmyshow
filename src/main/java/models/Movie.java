package models;

import resources.IdGenerator;

public class Movie {
    private Integer id;
    private String title;
    private int rating;

    public Movie(String title)
    {
        this.id = IdGenerator.generateId();
        this.title = title;
    }
}