package systems.vostok.dump.interview;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class FizzBuzz {
    private static final String FIZZ_MARK = "Fizz";
    private static final String BUZZ_MARK = "Buzz";
    private static final String FIZZ_BUZZ_MARK = "FizzBuzz";

    static IntConsumer consumer = number -> {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz) {
            System.out.println(FIZZ_BUZZ_MARK);
        } else if(isFizz) {
            System.out.println(FIZZ_MARK);
        } else if(isBuzz) {
            System.out.println(BUZZ_MARK);
        } else {
            System.out.println(number);
        }
    };

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .forEachOrdered(consumer);
    }
}
