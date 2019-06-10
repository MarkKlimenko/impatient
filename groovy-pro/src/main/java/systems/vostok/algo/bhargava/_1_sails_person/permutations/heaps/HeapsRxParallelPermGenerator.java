package systems.vostok.algo.bhargava._1_sails_person.permutations.heaps;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.subjects.PublishSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import systems.vostok.algo.bhargava._1_sails_person.implementations.SailsPersonRxParallelStyle;

import java.util.ArrayList;
import java.util.List;

public class HeapsRxParallelPermGenerator<E> {
    private static Logger logger = LoggerFactory.getLogger(HeapsRxParallelPermGenerator.class);

    public Observable<List<E>> generate(List<E> original) {
        logger.info("Start");
        return Observable.create(subscriber -> {
            perm(subscriber, original.size(), original);
            subscriber.onComplete();
        });
    }

    private void perm(ObservableEmitter<List<E>> subscriber, int n, List<E> list) {
        if (n == 1) {
            //logger.info("perm");
            subscriber.onNext(new ArrayList<>(list));
            //subscriber.onNext(list);
        } else {
            for (int i = 0; i < n; i++) {
                perm(subscriber, n - 1, list);

                int j = (n % 2 == 0) ? i : 0;

                E t = list.get(n - 1);
                list.set(n - 1, list.get(j));
                list.set(j, t);
            }
        }
    }
}
