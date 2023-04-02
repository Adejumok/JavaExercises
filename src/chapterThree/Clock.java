package chapterThree;

public class Clock {
    int day;
    int hour;
    int minute;
    int second;

    public void setTime(int hour, int minute, int second){
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60){
            throw new IllegalArgumentException("This hour, minute and/or second is out of range");
        }
        this.hour=hour;
        this.minute=minute;
        this.second=second;

    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String displayTime(){
        return String.format("%02d:%02d:%02d %s",((getHour() == 0 || getHour() == 12)
                ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public void tick(){
        if (second == 60){
            minute += 1;
            second = 0;
        }
         second += 1;
    }

    public void incrementMinute(){
        if (minute == 60){
            hour += 1;
            minute = 0;
        }
        minute += 1;
    }

    public void incrementHour(){
        if (hour == 24){
            day += 1;
            hour = 0;
        }
        hour += 1;
    }
}
