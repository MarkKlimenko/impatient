package systems.vostok.algo.bhargava._1_sails_person.permutations;

import java.util.ArrayList;
import java.util.List;

public class SimplePermGenerator<E> implements PermGenerator<E> {
    @Override
    public List<List<E>> generate(List<E> original) {
        if (original.size() == 0) {
            List<List<E>> result = new ArrayList<>();
            result.add(new ArrayList<E>());
            return result;
        }

        E firstElement = original.remove(0);
        List<List<E>> returnValue = new ArrayList<>();
        List<List<E>> permutations = generate(original);
        for (List<E> smallerPermutated : permutations) {
            for (int index=0; index <= smallerPermutated.size(); index++) {
                List<E> temp = new ArrayList<E>(smallerPermutated);
                temp.add(index, firstElement);
                returnValue.add(temp);
            }
        }
        return returnValue;
    }
}
