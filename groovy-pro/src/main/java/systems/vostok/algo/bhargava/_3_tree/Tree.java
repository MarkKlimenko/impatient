package systems.vostok.algo.bhargava._3_tree;

public class Tree<T extends Comparable> {
    Node<T> root;

    public Node<T> add(T value) {
        if(root == null) {
            return root = new Node<>(value, null, null);
        }

        return add(root, value);
    }

    private Node<T> add(Node<T> inRoot, T value) {
        if(value.compareTo(inRoot.value) < 0) {
            if(inRoot.left == null) {
                return inRoot.left = new Node<>(value, null, null);
            } else {
                return add(inRoot.left, value);
            }
        } else {
            if(inRoot.right == null) {
                return inRoot.right = new Node<>(value, null, null);
            } else {
                return add(inRoot.right, value);
            }
        }
    }

    public Node<T> find(T value) {
        return find(root, value);
    }

    private Node<T> find(Node<T> inRoot, T value) {
        if(value.compareTo(inRoot.value) == 0) {
            return inRoot;
        }

        if(value.compareTo(inRoot.value) < 0) {
            if(inRoot.left != null) {
                return find(inRoot.left, value);
            }
        } else {
            if(inRoot.right != null) {
                return find(inRoot.right, value);
            }
        }

        return null;
    }

    public Node<T> findNext(T value) {
        Node<T> pivot = find(value);



        //TODO: Implement
        return null;
    }
}
