package systems.vostok.algo.bhargava._1_sails_person.dao;

import java.util.List;

public class RouteData {
    List<String> route;
    Double distance;

    public RouteData(List<String> route) {
        this.route = route;
    }

    public RouteData setDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    public List<String> getRoute() {
        return route;
    }

    public Double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "RouteData{" +
                "route=" + route +
                ", distance=" + distance +
                '}';
    }
}
