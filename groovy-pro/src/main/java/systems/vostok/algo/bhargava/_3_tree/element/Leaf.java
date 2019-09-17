package systems.vostok.algo.bhargava._3_tree.element;

public class Leaf<T extends Comparable> implements TreeElement<T> {
    public Leaf() {
    }

    @Override
    public Leaf<T> add(T addedValue) {
       return null;
    }

    @Override
    public Leaf<T> find(T searchedValue) {
        return null;
    }

    @Override
    public Boolean isNode() {
        return false;
    }

    @Override
    public String toString() {
        return "Leaf{null}";
    }
}
