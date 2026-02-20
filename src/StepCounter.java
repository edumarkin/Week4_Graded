public class StepCounter {
    static int totalALL = 0;
    private int indSteps = 0;

    public void walk(int steps) {
        if (steps > 0) {
            indSteps += steps;
            totalALL += steps;
        }
    }
    public int getIndividualSteps() {
        return indSteps;
    }
    public static int getTotalALL() {
        return totalALL;
    }
    public static void reset() {
        totalALL = 0;
    }
}