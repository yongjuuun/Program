package 알고리즘.etc.Performance;

public class StrTest {
    private static final int MAX_LOOP_COUNT = 50000;

    public static void main(String[] args) {

        // StringBuilder
        StringBuilder builder = new StringBuilder();
        MadClock builderClock = new MadClock();
        builderClock.startClock();
        for (int loop = 1; loop <= MAX_LOOP_COUNT; loop++) {
            builder.append("mad").append(loop).append("play");
        }
        builderClock.stopClock();
        builderClock.printResult("StringBuilder");

        // StringBuffer
        StringBuffer buffer = new StringBuffer();
        MadClock bufferClock = new MadClock();
        bufferClock.startClock();
        for (int loop = 1; loop <= MAX_LOOP_COUNT; loop++) {
            buffer.append("mad").append(loop).append("play");
        }
        bufferClock.stopClock();
        bufferClock.printResult("StringBuffer");

        // String
        String str = "";
        MadClock stringClock = new MadClock();
        stringClock.startClock();
        for (int loop = 1; loop <= MAX_LOOP_COUNT; loop++) {
            str += "mad" + loop + "play";
        }
        stringClock.stopClock();
        stringClock.printResult("String");
    }
}
