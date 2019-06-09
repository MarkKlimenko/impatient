package systems.vostok.algo.bhargava._1_sails_person.calculator;

import systems.vostok.algo.bhargava._1_sails_person.dao.Point;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DistanceCalculator {
    private Map<String, Point> data;
    private Map<String, Double> cachedDistances = new HashMap<>();

    public DistanceCalculator(Map<String, Point> data) {
        this.data = data;
    }

    public Double calculate(List<String> route) {
        List<Double> distanceList = new LinkedList<>();

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

        return distanceList.stream().mapToDouble(Double::doubleValue).sum();
    }
}
