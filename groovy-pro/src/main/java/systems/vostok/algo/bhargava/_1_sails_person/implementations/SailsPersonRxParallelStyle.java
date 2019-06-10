package systems.vostok.algo.bhargava._1_sails_person.implementations;

import io.reactivex.Scheduler;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import systems.vostok.algo.bhargava._1_sails_person.calculator.DistanceCalculator;
import systems.vostok.algo.bhargava._1_sails_person.dao.Point;
import systems.vostok.algo.bhargava._1_sails_person.dao.RouteData;
import systems.vostok.algo.bhargava._1_sails_person.data.DataSupplier;
import systems.vostok.algo.bhargava._1_sails_person.permutations.heaps.HeapsRxParallelPermGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class SailsPersonRxParallelStyle {
    private static Logger logger = LoggerFactory.getLogger(SailsPersonRxParallelStyle.class);

    static final Map<String, Point> data = DataSupplier.getMapData();

    static DistanceCalculator distanceCalculator = new DistanceCalculator(data);

    static RouteData bestRoute = null;

    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        Scheduler scheduler = Schedulers.from(pool);

        ExecutorService pool0 = Executors.newSingleThreadExecutor();
        Scheduler scheduler0 = Schedulers.from(pool0);

        launch(scheduler, scheduler0);

        pool.shutdown();
        pool0.shutdown();
    }

    public static void launch(Scheduler scheduler, Scheduler scheduler0) {
        new HeapsRxParallelPermGenerator<String>()
                .generate(new ArrayList<>(data.keySet()))
                .subscribeOn(scheduler)
                .observeOn(scheduler0)
                .subscribe(new DisposableObserver<List<String>>() {
                    @Override
                    public void onNext(List<String> route) {
                        //logger.info("onNext");
                        Double distance = distanceCalculator.calculate(route);

                        if (bestRoute == null || bestRoute.getDistance().compareTo(distance) > 0) {
                            bestRoute = new RouteData(route, distance);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        logger.info(bestRoute.toString());
                    }
                });
    }
}
