package systems.vostok.dump.test;

import org.codehaus.groovy.runtime.StringGroovyMethods;

public class Test {
    public static void main(String[] args) {
        process(1215678);
    }

    public static void process(int number) {
        int[] store = new int[10];

        char[] arrNumber = (number + "").toCharArray();

        for (char c : arrNumber) {
            store[Integer.valueOf(c + "")] += 1;
        }


        for (int i = 0; i < store.length; i++) {
            if (store[i] != 0) {
                System.out.println(StringGroovyMethods.plus(i, "-") + store[i]);
            }

        }
    }
}
