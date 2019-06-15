package systems.vostok.algo.bhargava._2_array_linked_list;

import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList<T> implements Iterable<T> {
    private Element<T> firstElement;
    private Element<T> lastElement;

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
        if (lastElement == null) {
            firstElement = new Element<>(data, null, null);
            lastElement = firstElement;
            return data;
        } else {
            lastElement.nextElement = new Element<>(data, lastElement, null);
            lastElement = lastElement.nextElement;
            return data;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        Element<T> currentElement = firstElement;

        @Override
        public boolean hasNext() {
            if (currentElement != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public T next() {
            if (hasNext()) {
                T value = currentElement.data;
                currentElement = currentElement.nextElement;
                return value;
            } else {
                throw new NullPointerException();
            }
        }
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        for (T t : this) {
            action.accept(t);
        }
    }
}
