public class MathTool {
    public static long factorialRecursive(int n) {
        if (n < 0) {
            System.out.println("Number must be positive");
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    public static long factorialIterative(int n) {
        if (n < 0) {
            System.out.println("Number must be positive");
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}