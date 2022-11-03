package HomeWork_6.Task_6_2;

import HomeWork_0.ScannerHW;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    private static ScannerHW scannerHW = new ScannerHW();

    public static void setScannerHW(ScannerHW scannerHW) {
        Main.scannerHW = scannerHW;
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
//        Scanner in = new Scanner(System.in);
        int n = 0;
        while (n == 0) {
            System.out.print("Введите дату рождения в формате ГГГГ-ММ-ДД: ");
//            String dateStr = in.nextLine();
            String dateStr = scannerHW.scannerLine();
            try {
                date = LocalDate.parse(dateStr);
                n = 1;
            } catch (RuntimeException e) {
                System.out.println("Введенные данные некорректны. \n Попробуйте еще раз.");
            }
        }
        LocalDate nowDate = LocalDate.now();
        LocalDate currentDate = date;
        System.out.println("Дата рождения: " + date);
        int period = Period.between(date, nowDate).getYears();
        //Счетчик исключает проблему 29 февраля
        int counter = 0;
//        int currPeriod;
        while (counter < period) {
            int currentYar = currentDate.getYear();
            //Проверка на високосный год
            if ((currentYar % 4 == 0) && (currentYar % 100 != 0) || (currentYar % 400 == 0)) {
//                currPeriod=Period.between(date, currentDate).getYears();
                System.out.println("День рождения: " + currentDate + " возраст: " + counter);//+currPeriod+"/"
            }
            counter++;
            currentDate = date.plusYears(counter);
        }
    }
}
