package systems.vostok.algo.bhargava._3_tree;

import systems.vostok.algo.bhargava._3_tree.element.Node;
import systems.vostok.algo.bhargava._3_tree.element.TreeElement;

public class Tree<T extends Comparable> {
    Node<T> root;

    public TreeElement<T> add(T addedValue) {
        if (root == null) {
            return root = new Node<>(addedValue);
        }
        return root.add(addedValue);
    }

    public TreeElement<T> find(T searchedValue) {
        return root.find(searchedValue);
    }

    public TreeElement<T> findNext(T value) {
        TreeElement<T> pivot = find(value);

        //TODO: Implement
        return null;
    }
}
