package h2;

public class H2_main {

    public static void benchmark(int n) {
        long start, end;

        start = System.nanoTime();
        fibRecursive(n);
        end = System.nanoTime();
        System.out.println("fibRecursive: " + (end - start) + " ns");

        start = System.nanoTime();
        fibRecursiveCached(n, new int[n + 1]);
        end = System.nanoTime();
        System.out.println("fibRecursiveCached: " + (end - start) + " ns");

        start = System.nanoTime();
        fibIterative(n);
        end = System.nanoTime();
        System.out.println("fibIterative: " + (end - start) + " ns");
    }


    public static int fibRecursive(int n) {
        if (n <= 2) return 1;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static int fibRecursiveCached(int n, int[] cache) {
        if (n <= 2) return 1;
        if (cache[n] != 0) return cache[n];

        cache[n] = fibRecursiveCached(n - 1, cache)
                + fibRecursiveCached(n - 2, cache);
        return cache[n];
    }


    public static int fibIterative(int n) {
        if (n <= 2) return 1;

        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 40;
        benchmark(n);
    }
}