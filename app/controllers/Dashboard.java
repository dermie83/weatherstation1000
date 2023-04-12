package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Station;
import models.Reading;
import play.Logger;
import play.mvc.Controller;

public class Dashboard extends Controller
{
  public static void index() {
    Logger.info("Rendering Dashboard");

//    Reading r1 = new Reading(400,5.6,3.3,1001);
//    Reading r2 = new Reading(500,6.0,5.3,990);
//    Reading r3 = new Reading(700,7.3,4.3,1100);
//    Station s1 = new Station("Tramore");
//    s1.readings.add (r1);
//    s1.readings.add (r2);
//    s1.readings.add (r3);
//
//    Reading r4 = new Reading(500,6.6,6.3,900);
//    Reading r5 = new Reading(700,7.1,5.6,1000);
//    Reading r6 = new Reading(900,3.3,6.3,1100);
//    Station s2 = new Station("Derry");
//    s2.readings.add (r4);
//    s2.readings.add (r5);
//    s2.readings.add (r6);
//
//    List<Station> stations = new ArrayList<Station>();
//    stations.add (s1);
//    stations.add (s2);


    List<Station> stations = Station.findAll();
    render ("dashboard.html", stations);
  }
}

