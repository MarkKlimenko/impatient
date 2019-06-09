package systems.vostok.algo.bhargava._1_sails_person.permutations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HeapsPermGenerator<E> implements PermGenerator<E> {
    private List<List<E>> permutations = new LinkedList<>();

    @Override
    public List<List<E>> generate(List<E> original) {
        perm(original.size(), original);
        return permutations;
    }

    private void perm(int n, List<E> elements) {

        if (n == 1) {
            addToPerm(elements);
        } else {
            for (int i = 0; i < n - 1; i++) {
                perm(n - 1, elements);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            perm(n-1, elements);
        }
    }

    private void swap(List<E> input, int a, int b) {
        E tmp = input.get(a);
        input.set(a, input.get(b));
        input.set(b, tmp);
    }

    private void addToPerm(List<E> input) {
        permutations.add(input);
    }
}
