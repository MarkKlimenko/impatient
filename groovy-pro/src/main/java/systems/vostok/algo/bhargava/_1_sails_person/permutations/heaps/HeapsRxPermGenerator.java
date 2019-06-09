package systems.vostok.algo.bhargava._1_sails_person.permutations.heaps;

import io.reactivex.subjects.PublishSubject;
import systems.vostok.algo.bhargava._1_sails_person.permutations.PermGenerator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HeapsRxPermGenerator<E> {
    private PublishSubject<List<E>> source;

    public HeapsRxPermGenerator(PublishSubject<List<E>> source) {
        this.source = source;
    }

    public void generate(List<E> original) {
        perm(original.size(), original);
        source.onComplete();
    }

    void perm(int n, List<E> list) {
        if (n == 1) {
            source.onNext(list);
        } else {
            for (int i = 0; i < n; i++) {
                perm( n - 1, list);

                int j = (n % 2 == 0) ? i : 0;

                E t = list.get(n - 1);
                list.set(n - 1, list.get(j));
                list.set(j, t);
            }
        }
    }
}
