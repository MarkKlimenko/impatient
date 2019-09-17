package systems.vostok.algo.bhargava._3_tree.element;

public class Node<T extends Comparable> implements TreeElement<T> {
    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node<T> add(T addedValue) {
        if(addedValue.compareTo(value) < 0) {
            if(left == null) {
                return left = new Node<>(addedValue, null, null);
            } else {
                return left.add(addedValue);
            }
        } else {
            if(right == null) {
                return right = new Node<>(addedValue, null, null);
            } else {
                return right.add(addedValue);
            }
        }
    }

    public Node<T> find(T searchedValue) {
        if(searchedValue.compareTo(value) == 0) {
            return this;
        }

        if(searchedValue.compareTo(value) < 0) {
            if(left != null) {
                return left.find(searchedValue);
            }
        } else {
            if(right != null) {
                return right.find(searchedValue);
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
