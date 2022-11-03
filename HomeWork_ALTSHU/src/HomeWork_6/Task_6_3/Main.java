package HomeWork_6.Task_6_3;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime date1 = ZonedDateTime.now();

        System.out.println(date1);
        System.out.println("Текущая временная зона: "+date1.getZone());
        System.out.println("Текущее время: "+LocalTime.now());
        System.out.println("*******************************************************************");

        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        Object[] arr = zoneId.stream().toArray();
        int counter = 10;
        int number=1;
        for (int i = 0; i < counter; i++) {
            if (arr[i].toString().equals(date1.getZone().toString())) {
                counter = counter + 1;
                continue;
            }
            ZoneId zoneId1 = ZoneId.of(arr[i].toString());
            TimeZone timeZone = TimeZone.getTimeZone(arr[i].toString());
            System.out.println("" + number + ". " + arr[i] + "  " + LocalTime.now(zoneId1));
            number++;
        }
    }
}
