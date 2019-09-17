package systems.vostok.algo.bhargava._3_tree.element;

public class Node<T extends Comparable> implements TreeElement<T> {
    T value;
    TreeElement<T> left;
    TreeElement<T> right;

    public Node(T value, TreeElement<T> left, TreeElement<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(T value) {
        this(value, new Leaf<>(), new Leaf<>());
    }

    public TreeElement<T> add(T addedValue) {
        if(addedValue.compareTo(value) < 0) {
            if(!left.isNode()) {
                return left = new Node<>(addedValue);
            } else {
                return left.add(addedValue);
            }
        } else {
            if(!right.isNode()) {
                return right = new Node<>(addedValue);
            } else {
                return right.add(addedValue);
            }
        }
    }

    public TreeElement<T> find(T searchedValue) {
        if(searchedValue.compareTo(value) == 0) {
            return this;
        }

        if(searchedValue.compareTo(value) < 0) {
            return left.find(searchedValue);
        } else {
            return right.find(searchedValue);
        }
    }

    @Override
    public Boolean isNode() {
        return true;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
