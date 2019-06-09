package systems.vostok.algo.bhargava._1_sails_person.permutations;

import java.util.List;

public interface PermGenerator<E> {
    List<List<E>> generate(List<E> original);
}
