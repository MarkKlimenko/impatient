package systems.vostok.algo.bhargava._1_sails_person.calculator;

import systems.vostok.algo.bhargava._1_sails_person.dao.Point;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class DistanceCalculator {
    private Map<String, Point> data;
    private Map<String, Double> cachedDistances = new ConcurrentHashMap<>();

    public DistanceCalculator(Map<String, Point> data) {
        this.data = data;
    }

    public Double calculate(List<String> route) {
        List<Double> distanceList = new ArrayList<>(route.size() - 1);

        for (int i = 0; i < route.size() - 1; i++) {
            String routePartIndex = route.get(i) + route.get(i+1);

            if(cachedDistances.get(routePartIndex) != null) {
                distanceList.add(cachedDistances.get(routePartIndex));
            } else {
                String from = route.get(i);
                Point fromPoint = data.get(from);

                String to = route.get(i+1);
                Point toPoint = data.get(to);

                Double routePartDistance = Math.sqrt(Math.pow(toPoint.x - fromPoint.x, 2) + Math.pow(toPoint.y - fromPoint.y, 2));

                cachedDistances.put(routePartIndex, routePartDistance);
                distanceList.add(routePartDistance);
            }
        }

        Double sum = 0D;
        for (Double distance : distanceList) {
            sum += distance;
        }

        return sum;
    }
}
