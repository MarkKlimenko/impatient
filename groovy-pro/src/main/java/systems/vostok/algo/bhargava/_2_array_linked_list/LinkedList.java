package systems.vostok.algo.bhargava._2_array_linked_list;

public class LinkedList<T> {
    Element<T> firstElement;
    Element<T> lastElement;

    private static class Element<T> {
        T data;
        Element<T> prevElement;
        Element<T> nextElement;

        public Element(T data, Element<T> prevElement, Element<T> nextElement) {
            this.data = data;
            this.prevElement = prevElement;
            this.nextElement = nextElement;
        }
    }

    T add(T data) {
        if(firstElement == null) {
            firstElement = new Element<>(data, null, null);
            return data;
        } else {
            return data;
        }
    }
}
