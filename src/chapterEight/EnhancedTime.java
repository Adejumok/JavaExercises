package chapterEight;

import chapterThree.Clock;

public class EnhancedTime {
    public static void main(String[] args) {
        Clock clock2 = new Clock();
        clock2.setTime(1,50,12);
        clock2.tick();
        clock2.incrementMinute();
        clock2.incrementHour();
        System.out.println(clock2.displayTime());
    }
}
