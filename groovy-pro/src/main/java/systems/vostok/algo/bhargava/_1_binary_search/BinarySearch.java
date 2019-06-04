package systems.vostok.algo.bhargava._1_binary_search;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearch {
    public static void main(String[] args) {
        int[] data = IntStream.rangeClosed(1, 100)
                .filter(n -> n != 13 )
                .toArray();

        Arrays.stream(data).forEach(System.out::print); // 1..100
        System.out.println();
        System.out.println(find(data, 4) == 4); //true
        System.out.println(find(data, 13) == -1); //true
    }

    // find not recursive
    static int find(int[] data, int n) {
        int firstIndex = 0;
        int lastIndex = data.length - 1;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if(data[middleIndex] == n) {
                return n;
            } else if(data[middleIndex] > n) {
                lastIndex = middleIndex - 1;
            } else {
                firstIndex = middleIndex + 1;
            }
        }

        return -1;
    }

    // TODO: Find recursive

}
