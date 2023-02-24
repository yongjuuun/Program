package 알고리즘.etc.Performance;

public class MadClock {
    private long startTime;
    private long endTime;

    public void startClock() {
        startTime = System.nanoTime();
    }

    public void stopClock() {
        endTime = System.nanoTime();
    }

    public void printResult(String clockName) {
        System.out.printf("%s" + " : %.3f seconds %n",
                clockName, (endTime - startTime) / (double) 1_000_000_000);
    }
}
