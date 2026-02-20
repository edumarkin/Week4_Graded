public class TestMathTool {

    public static void main(String[] args) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            MathTool.factorialRecursive(20);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Recursive time: " +
                (endTime - startTime) + " ms");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            MathTool.factorialIterative(20);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iterative time: " +
                (endTime - startTime) + " ms");
    }
}