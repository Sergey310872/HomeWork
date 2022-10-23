package HomeWork_6.Task_6_3;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime date1 = ZonedDateTime.now();
//        System.out.println(date1);
        System.out.println(date1);
        System.out.println("Текущая временная зона: "+date1.getZone());
        System.out.println("Текущее время: "+LocalTime.now());
        System.out.println("*******************************************************************");
//        System.out.println(date1.getZone().getId());
//        System.out.println(date1.getZone().hashCode());

        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        Object[] arr = zoneId.stream().toArray();
        int counter = 10;
        int number=1;
        for (int i = 0; i < counter; i++) {
            if (arr[i].toString().equals(date1.getZone().toString())) {
//                System.out.println("*******************************************************************");
                counter = counter + 1;
                continue;
            }
            ZoneId zoneId1 = ZoneId.of(arr[i].toString());
            TimeZone timeZone = TimeZone.getTimeZone(arr[i].toString());
            System.out.println("" + number + ". " + arr[i] + "  " + LocalTime.now(zoneId1));
            number++;
//            System.out.println(""+i+" "+arr[i]+" time: "+TimeZone.getTimeZone(arr[i].toString()));
//            System.out.println(""+i+" "+arr[i]+" time: "+TimeZone.getTimeZone(arr[i].toString()).getOffset());
        }
//        System.out.println("surch: " + zoneId.contains(date1.getZone().toString()));
//        int n = 1;
//        for (String s : zoneId) {
//            while (n <= 10) {
//                TimeZone timeZone = TimeZone.getTimeZone(arr[i].toString());
//                System.out.println("" + n + ". " + s);
//                n++;
//            }
//        }
//        System.out.println("zoneId: " + zoneId);

//        System.out.println(": " + period);
//        System.out.println(": "+period.getYears());
//        DateTimeFormatter.


//        ZonedDateTime date1 = ZonedDateTime.now();

//        TimeZone timeZone = TimeZone.getDefault();
//        System.out.println(timeZone);
//        System.out.println(TimeZone.SHORT);
//        System.out.println(TimeZone.getTimeZone("GMT+5"));

    }
}
