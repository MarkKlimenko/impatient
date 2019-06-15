package systems.vostok.algo.bhargava._2_array_linked_list;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");

        linkedList.forEach(System.out::println);
    }
}
