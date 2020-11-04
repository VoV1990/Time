import java.util.Calendar;
import java.util.GregorianCalendar;

//Составьте описание класса для представления времени.
//Предусмотрите возможности установки времени и изменения его отдельных полей (час, минута, секунда) с
//проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается
//в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.

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
