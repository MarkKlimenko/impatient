package systems.vostok.algo.bigsort.basic

import java.math.RoundingMode

import static java.math.RoundingMode.CEILING

class CopyMergeSort {
    static void main(String[] args) {
        [6, 2, 1, 5, 3].with(this.&copyMergeSort)
                .with(this.&print)
    }

    static List copyMergeSort(List array) {
        if (array.size() < 2) {
            return array
        } else if (array.size() == 2) {
            return array[0] < array[1] ? array : array.reverse()
        }

        List collatedArray = (array.size() / 2)
                .setScale(0, CEILING)
                .with { it as Integer }
                .with(array.&collate)

        List sub1 = copyMergeSort(collatedArray[0])
        List sub2 = copyMergeSort(collatedArray[1])

        merge(sub1, sub2, array)
    }

    static List merge(List sub1, List sub2, List array) {
        LinkedList subL1 = sub1 as LinkedList
        LinkedList subL2 = sub2 as LinkedList

        array = []
        while(subL1 || subL2) {
            if((subL1.peek() <= subL2.peek() && subL1.peek()) || !subL2.peek()) {
                array << subL1.poll()
            } else {
                array << subL2.poll()
            }
        }
        array
    }
}
