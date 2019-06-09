package systems.vostok.algo.bhargava._1_sails_person.implementations;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import systems.vostok.algo.bhargava._1_sails_person.calculator.DistanceCalculator;
import systems.vostok.algo.bhargava._1_sails_person.dao.Point;
import systems.vostok.algo.bhargava._1_sails_person.dao.RouteData;
import systems.vostok.algo.bhargava._1_sails_person.data.DataSupplier;
import systems.vostok.algo.bhargava._1_sails_person.permutations.heaps.HeapsPermGenerator;
import systems.vostok.algo.bhargava._1_sails_person.permutations.heaps.HeapsRxPermGenerator;

import java.util.*;
import java.util.stream.Stream;

/**
 * BenchmarkRunner.sailsPersonRx i3      ss   10  10,239 ± 0,435   s/op
 * BenchmarkRunner.sailsPersonRx i3 oi   ss   10  5,275 ± 0,515   s/op
 */
public class SailsPersonRxStyle {
    static final Map<String, Point> data = DataSupplier.getMapData();

    static DistanceCalculator distanceCalculator = new DistanceCalculator(data);

    static RouteData bestRoute = null;

    public static void main(String[] args) {
        PublishSubject<List<String>> subject = PublishSubject.create();
        subject.subscribe(getObserver());

        HeapsRxPermGenerator<String> permGenerator = new HeapsRxPermGenerator<>(subject);
        permGenerator.generate(new ArrayList<>(data.keySet()));
    }

    private static Observer<List<String>> getObserver() {
        return new Observer<List<String>>() {
            @Override
            public void onSubscribe(Disposable d) {
                //System.out.println("Start");
            }

            @Override
            public void onNext(List<String> route) {
                Double distance = distanceCalculator.calculate(route);

                if (bestRoute == null || bestRoute.getDistance().compareTo(distance) > 0) {
                    bestRoute = new RouteData(route, distance);
                }
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error");
            }

            @Override
            public void onComplete() {
                System.out.println(bestRoute);
            }
        };
    }
}
