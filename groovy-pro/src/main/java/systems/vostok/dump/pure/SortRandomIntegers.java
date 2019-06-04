package systems.vostok.dump.pure;

import java.util.stream.IntStream;

public class SortRandomIntegers {
    public static void main(String[] args) {
        /*IntStream.range(0, 45000000)
                .parallel()
                .map(i -> (int) (Math.random() * i))
                .sorted()
                .forEachOrdered(System.out::println);*/


        IntStream.range(0, 45000000)
                .map(i -> (int) (Math.random() * i))
                .sorted()
                .forEach(System.out::println);
    }
}
