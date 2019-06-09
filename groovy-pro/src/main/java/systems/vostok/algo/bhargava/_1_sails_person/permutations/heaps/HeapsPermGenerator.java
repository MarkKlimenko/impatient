package systems.vostok.algo.bhargava._1_sails_person.permutations.heaps;

import systems.vostok.algo.bhargava._1_sails_person.permutations.PermGenerator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HeapsPermGenerator<E> implements PermGenerator<E> {
    private List<List<E>> permutations = new LinkedList<>();

    @Override
    public List<List<E>> generate(List<E> original) {
        perm(original.size(), original);
        return permutations;
    }

    void perm(int n, List<E> list) {
        if (n == 1) {
            permutations.add(new ArrayList<>(list));
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
