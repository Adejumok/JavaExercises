package chapterThree;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock=new Clock();
        clock.setTime(13,45,32);
        try {
            clock.setTime(19,47,75);
        }catch (IllegalArgumentException e){
            System.out.printf("Exception: %s\n", e.getMessage());
        }
        System.out.println(clock.displayTime());

    }
}
