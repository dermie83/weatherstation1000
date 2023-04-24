package controllers;

import java.util.List;
import play.Logger;
import models.Station;
import models.Reading;
import play.mvc.Controller;

public class StationCtrl extends Controller {
    public static void index(Long id) {
        Station station = Station.findById(id);
        Logger.info("Station id = " + id);
        render("station.html", station);
    }

    public static void deleteReading(Long id, Long readingID)
    {
        Station station = Station.findById(id);
        Reading reading = Reading.findById(readingID);
        station.readings.remove(reading);
        station.save();
        reading.delete();
        Logger.info ("Removing " + reading.code);

        render("station.html", station);

    }
}
