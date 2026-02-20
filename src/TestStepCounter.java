public class TestStepCounter {
    public static void main(String[] args) {
        StepCounter userA = new StepCounter();
        StepCounter userB = new StepCounter();
        userA.walk(1000);
        userA.walk(500);
        userB.walk(2000);
        System.out.println("User A steps: " + userA.getIndividualSteps());
        System.out.println("User B steps: " + userB.getIndividualSteps());
        System.out.println("Total steps (of alll users in the milky way): "
                + StepCounter.getTotalALL());
        StepCounter.reset();
        System.out.println("After reset:");
        System.out.println("Total steps: "
                + StepCounter.getTotalALL());
    }
}