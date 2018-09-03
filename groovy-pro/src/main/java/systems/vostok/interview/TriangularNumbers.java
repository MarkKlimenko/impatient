package systems.vostok.interview;

public class TriangularNumbers {
    public static void main(String[] args) {
        System.out.println(recursionCompute(6));
        System.out.println(iterationCompute(6));
    }
    
    private static int recursionCompute(int i) {
        return recursionCompute(0, i);
    }
    private static int recursionCompute(int sum, int i) {
        if(i<1) {
            return sum;
        }

        return i + recursionCompute(sum, --i);
    }

    
    private static int iterationCompute(int i) {
        int sum = 0;

        for (int j = 1; j <=i ; j++) {
            sum = sum + j;
        }
        return sum;
    }
}
