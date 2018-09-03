package systems.vostok.interview;

public class GaussSum {
    public static void main(String[] args) {
        int n = 6;

        System.out.println((n + 1) * n / 2);
        System.out.println(calculateIterable(n));
        System.out.println(calculateRecursion(n));
        System.out.println(calculateBottomUp(n));
    }

    private static int calculateIterable(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    private static int calculateRecursion(int n) {
        if (n < 1) {
            return 0;
        }
        return n + calculateRecursion(--n);
    }
//--------------------------------
    private static int calculateBottomUp(int n) {
        return calc(1, n, 0);
    }

    private static int calc(int current, int max, int sum) {
        if (current > max) {
            return sum;
        }
        return calc(current + 1, max, sum + current);
    }
//--------------------------------
}
