package systems.vostok.dump.sort;

class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 9, 1, 5, 4, 8, 7, 8, 88, 61, 48, 71, 20, 14, 4, 52};

        sort(array);

        for(int val: array) {
            System.out.print(val + " ");
        }
    }

    static int[] sort(int[] array) {
        for(int value: array) {
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    int buf = array[i];

                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }
}