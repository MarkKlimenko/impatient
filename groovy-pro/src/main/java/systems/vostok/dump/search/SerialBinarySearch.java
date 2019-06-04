package systems.vostok.dump.search;

class SerialBinarySearch {
    public static void main(String[] args) {
        int [] array = {1,5,10,16,18,24,31,45,58,67,79,81};

        System.out.println(search(16, array));
        System.out.println(search(81, array));
        System.out.println(search(90, array));
    }

    static int search(int value, int [] array) {
        int min = 0;
        int max = array.length - 1;

        while(min <= max) {
            int middle = (min + max) / 2;

            if(array[middle] == value) {
                return array[middle];
            } else if(array[middle] > value) {
                max = middle - 1;
            } else if(array[middle] < value) {
                min = middle + 1;
            }
        }

        return -1;
    }
}
