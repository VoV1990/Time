import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;
    Calendar calendar;

    public Time() {
        calendar = new GregorianCalendar();
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minutes = calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND);
    }

    public Time(int hour, int minutes, int seconds) {
        if(hour > 23 || hour < 0) hour = 0;
        if(minutes > 59 || minutes < 0) minutes = 0;
        if(seconds > 59 || seconds < 0) seconds = 0;
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%02d ч %02d мин %02d с", hour, minutes, seconds);
    }
}
