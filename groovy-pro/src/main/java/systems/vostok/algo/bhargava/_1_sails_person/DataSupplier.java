package systems.vostok.algo.bhargava._1_sails_person;

import systems.vostok.algo.bhargava._1_sails_person.dao.Point;

import java.util.HashMap;
import java.util.Map;

public class DataSupplier {
    public static Map<String, Point> getMapData() {
        Map<String, Point> data = new HashMap<>();
        data.put("marin", new Point(2, 1));
        data.put("sanFrancisco", new Point(2, 5));
        data.put("berkeley", new Point(10, 1));
        data.put("paloAlto", new Point(2, 12));
        data.put("fremont", new Point(11, 11));
        data.put("cupertino", new Point(4, 6));
        data.put("millValley", new Point(5, 1));
        data.put("santa", new Point(15, 13));
        data.put("berbank", new Point(20, 15));

        return data;
    }
}
