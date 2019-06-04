package systems.vostok.dump.search;

class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,3,4,9,10,24,34,45,57,61,75,81,94};

        System.out.println(find(10, array));
        System.out.println(find(61, array));
        System.out.println(find(94, array));
        System.out.println(find(100, array));
    }

    static int find(int value, int[] array) {
        return binarySearch(value, array, 0, array.length - 1);
    }

    static int binarySearch(int value, int[] array, int min, int max) {
        int middle = (min + max) / 2;

        if(min > max) {
            return -1;
        }

        if(array[middle] == value) {
            return array[middle];
        } else if(array[middle] > value) {
            return binarySearch(value, array, min, middle - 1);
        } else {
            return binarySearch(value, array, middle + 1, max);
        }
    }
}
