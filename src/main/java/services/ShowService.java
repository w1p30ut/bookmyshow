package services;

import models.Show;

import java.util.HashMap;
import java.util.List;

public class ShowService {
    private HashMap<Integer, Show> showHashMap;
    public List<Show> getAvailableShows()
    {
        return (List<Show>) this.showHashMap.values();
    }

    public Show createShow()
}