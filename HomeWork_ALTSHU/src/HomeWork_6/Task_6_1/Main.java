package HomeWork_6.Task_6_1;

import HomeWork_0.ScannerHW;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    private static ScannerHW scannerHW = new ScannerHW();

    public static void setScannerHW(ScannerHW scannerHW) {
        Main.scannerHW = scannerHW;
    }

    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
//        Scanner in = new Scanner(System.in);
        int n=0;
        while (n==0) {
            System.out.print("Введите дату в формате ГГГГ-ММ-ДД: ");
//            String dateStr = in.nextLine();
            String dateStr = scannerHW.scannerLine();
            try {
                date = LocalDate.parse(dateStr);
                n=1;
            } catch (RuntimeException e) {
                System.out.println("Введенные данные некорректны. \n Попробуйте еще раз.");
            }
        }
        String strDateOfWeek=date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
        System.out.println("Введенная дата: "+date);
        System.out.println("   день недели: "+strDateOfWeek);
    }
}
