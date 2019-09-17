package systems.vostok.algo.bhargava._3_tree.element;

public interface TreeElement<T extends Comparable> {
    TreeElement<T> add(T addedValue);
    TreeElement<T> find(T searchedValue);
    Boolean isNode();
}
