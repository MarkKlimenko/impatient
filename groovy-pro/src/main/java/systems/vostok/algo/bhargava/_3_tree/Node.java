package systems.vostok.algo.bhargava._3_tree;

public class Node<T extends Comparable> {
    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
