package systems.vostok.algo.bhargava._2_selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {1,3,9,6,4,5,2};

        for(int i: sort(data)){
            System.out.println(i);
        }
    }

    static int[] sort(int[] data) {
        for(int i = 0; i < data.length; i ++) {
            for(int j = i; j < data.length; j ++) {
                if(data[j] < data[i]) {
                    int buffer = data[i];
                    data[i] = data[j];
                    data[j] = buffer;
                }
            }
        }
        return data;
    }
}
