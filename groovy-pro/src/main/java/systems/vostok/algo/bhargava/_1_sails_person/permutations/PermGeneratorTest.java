package systems.vostok.algo.bhargava._1_sails_person.permutations;

import systems.vostok.algo.bhargava._1_sails_person.data.DataSupplier;
import systems.vostok.algo.bhargava._1_sails_person.dao.Point;
import systems.vostok.algo.bhargava._1_sails_person.permutations.heaps.HeapsPermGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PermGeneratorTest {
    public static void main(String[] args) {
        Map<String, Point> data = DataSupplier.getMapData();

        long aTime = System.currentTimeMillis();

        List<String> cities = new ArrayList<>(data.keySet());

        List<List<String>>  heapsPermGeneratorDataset = new HeapsPermGenerator<String>().generate(cities);
        List<List<String>>  simplePermGeneratorDataset = new SimplePermGenerator<String>().generate(cities);

        System.out.println(heapsPermGeneratorDataset.size());
        System.out.println(simplePermGeneratorDataset.size());

        System.out.println(System.currentTimeMillis() - aTime);
    }
}
