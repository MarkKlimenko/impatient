package systems.vostok.algo.bhargava._1_sails_person;

import systems.vostok.algo.bhargava._1_sails_person.calculator.DistanceCalculator;
import systems.vostok.algo.bhargava._1_sails_person.dao.Point;
import systems.vostok.algo.bhargava._1_sails_person.dao.RouteData;
import systems.vostok.algo.bhargava._1_sails_person.permutations.heaps.HeapsPermGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * heaps perm - 2100
 */
public class SailsPersonParallelStyle {
    public static void main(String[] args) {
        Map<String, Point> data = DataSupplier.getMapData();

        long aTime = System.currentTimeMillis();

        DistanceCalculator calculator = new DistanceCalculator(data);

        Stream<RouteData> dataStream = findAllPossibleRoutes(data)
                .parallelStream()
                .map(route -> new RouteData(route))
                .map(routeData -> routeData.setDistance(calculator.calculate(routeData.getRoute())))
                /*.peek(routeData -> *//*System.out.println(routeData)*//*)*/;

        RouteData minRoute = dataStream.min(Comparator.comparingDouble(RouteData::getDistance)).get();
        System.out.println("Min: " + minRoute);
        System.out.println(System.currentTimeMillis() - aTime);
    }

    static List<List<String>> findAllPossibleRoutes(Map<String, Point> data) {
        List<String> cities = new ArrayList<>(data.keySet());
        return new HeapsPermGenerator<String>().generate(cities);
    }
}
