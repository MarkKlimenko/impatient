package systems.vostok.dump.search;

class SequentialSearch {
    public static void main(String[] args) {
        int[] array = {1,2,6,8,7,9,15,61,71,84};

        System.out.println(search(15, array));
        System.out.println(search(10, array));
    }

    static int search(int value, int[] array) {
        for(int arrayValue: array) {
            if(arrayValue == value) {
                return arrayValue;
            }
        }
        return -1;

    }
}
