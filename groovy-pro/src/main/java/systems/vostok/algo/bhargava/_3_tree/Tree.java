package systems.vostok.algo.bhargava._3_tree;

import systems.vostok.algo.bhargava._3_tree.element.Node;

public class Tree<T extends Comparable> {
    Node<T> root;

    public Node<T> add(T addedValue) {
        if(root == null) {
            return root = new Node<>(addedValue, null, null);
        }
        return root.add(addedValue);
    }

    public Node<T> find(T searchedValue) {
        return root.find(searchedValue);
    }

    public Node<T> findNext(T value) {
        Node<T> pivot = find(value);

        //TODO: Implement
        return null;
    }
}
