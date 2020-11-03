import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Time currentTime = new Time();
        System.out.println("Current time: " + currentTime);
        currentTime.setHour(17);
        System.out.println("Current time after changes: " + currentTime);

        System.out.println("Please enter your time(hour, minutes, seconds): ");
        int hour = Integer.parseInt(reader.readLine());
        int minutes = Integer.parseInt(reader.readLine());
        int seconds = Integer.parseInt(reader.readLine());
        Time newTime = new Time(hour, minutes, seconds);
        System.out.println("Your time: " + newTime);
    }
}
