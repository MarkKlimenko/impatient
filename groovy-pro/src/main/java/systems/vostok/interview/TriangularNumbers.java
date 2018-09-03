package systems.vostok.interview;

public class TriangularNumbers {
    public static void main(String[] args) {
        System.out.println(recursionCompute(6));
        System.out.println(iterationCompute(6));
    }

    private static int recursionCompute(int i) {
        if(i<1) {
            return 0;
        }
        return i + recursionCompute(--i);
    }

    
    private static int iterationCompute(int i) {
        int sum = 0;

        for (int j = 1; j <=i ; j++) {
            sum = sum + j;
        }
        return sum;
    }
}
