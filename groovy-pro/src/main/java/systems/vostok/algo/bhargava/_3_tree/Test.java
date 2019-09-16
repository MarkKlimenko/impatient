package systems.vostok.algo.bhargava._3_tree;

public class Test {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        tree.add(5);
        tree.add(10);
        tree.add(1);
        tree.add(20);

        System.out.println(tree.find(10));
    }
}
