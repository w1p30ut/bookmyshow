package controllers;

import models.Show;
import services.ShowService;

import java.util.List;

public class ShowController {
    private static ShowService showService;
    public static List<Show> getAvailableShows() {
        return showService.getAvailableShows();
    }
}
