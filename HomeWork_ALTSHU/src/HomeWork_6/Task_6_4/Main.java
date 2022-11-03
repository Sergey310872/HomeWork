package HomeWork_6.Task_6_4;

import HomeWork_0.ScannerHW;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static ScannerHW scannerHW = new ScannerHW();
    public static void setScannerHW(ScannerHW scannerHW) {
        Main.scannerHW = scannerHW;
    }

    public static void main(String[] args) {
        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        Object[] arr = zoneId.stream().toArray();
        int number = arr.length;
        int timeZone_1 = NumberTimeZone("Введите индекс 1-й временной зоны в диапазоне от 0 до ", number);
        int timeZone_2 = NumberTimeZone("Введите индекс 2-й временной зоны в диапазоне от 0 до ", number);
        System.out.println();
        ZoneId zoneId1 = ZoneId.of(arr[timeZone_1].toString());
        System.out.println("1-я таймзона: " + arr[timeZone_1] + " местное время: " + LocalTime.now(zoneId1));
        ZoneId zoneId2 = ZoneId.of(arr[timeZone_2].toString());
        System.out.println("2-я таймзона: " + arr[timeZone_2] + " местное время: " + LocalTime.now(zoneId2));
    }

    public static int NumberTimeZone(String str, int n) {
//        Scanner in = new Scanner(System.in);
        int counter = 0;
        while (counter == 0) {
            System.out.print(str + n + ": ");
//            int num = in.nextInt();
            int num = scannerHW.scannerInt();
            if (num >= 0 && num <= n) {
                //               counter=1;
                return num;
            } else {
                System.out.println("Неправильное число. Попробуйте еще раз.");
            }
        }
        return -1;
    }
}
