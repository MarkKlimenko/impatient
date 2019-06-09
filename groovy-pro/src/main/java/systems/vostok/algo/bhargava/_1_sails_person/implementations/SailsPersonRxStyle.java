package systems.vostok.algo.bhargava._1_sails_person.implementations;

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
public class SailsPersonRxStyle {
    public static void main(String[] args) {

    }

    static List<List<String>> findAllPossibleRoutes(Map<String, Point> data) {
        List<String> cities = new ArrayList<>(data.keySet());
        return new HeapsPermGenerator<String>().generate(cities);
    }
}
