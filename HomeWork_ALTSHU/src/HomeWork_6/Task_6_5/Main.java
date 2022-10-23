package HomeWork_6.Task_6_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Holidays> holiday = new ArrayList<Holidays>();
        holiday.add(new Holidays("Новый Год", 31, 12));
        holiday.add(new Holidays("День Учителя", 5, 10));
        holiday.add(new Holidays("День Знаний", 1, 9));
        holiday.add(new Holidays("Международный день похмелья", 1, 1));

        LocalDate date = LocalDate.now();
        Scanner in = new Scanner(System.in);
        int n = 0;
        while (n == 0) {
            System.out.print("Введите дату в формате ГГГГ-ММ-ДД: ");
            String dateStr = in.nextLine();
            try {
                date = LocalDate.parse(dateStr);
                n = 1;
            } catch (RuntimeException e) {
                System.out.println("Введенные данные некорректны. \n Попробуйте еще раз.");
            }
        }
//        String strDateOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
//        System.out.println("Введенная дата: " + date);
//        System.out.println("   день недели: " + strDateOfWeek);

        boolean labelHoliday = false;
        for (Holidays hd : holiday) {
            if (date.getDayOfMonth() == hd.dayOfMonth && date.getMonth().getValue() == hd.month) {
                System.out.println("Этот день праздничный. Отмечается праздник: " + hd.name);
                labelHoliday = true;
            }
        }

        switch (date.getDayOfWeek().getValue()) {
            case 4:
                if (labelHoliday) {
                    System.out.println("Это праздничный и, одновременно, четверг!");
                } else {
                    System.out.println("Это четверг, а четверг - это маленькая пятница.");
                }
                break;
            case 5:
                if (labelHoliday) {
                    System.out.println("Это праздничный и, одновременно, пятница!");
                } else {
                    System.out.println("Это пятница, а пятница - это день, когда работа заканчивается и можно уйти с работы пораньше.");
                }
                break;
            case 6:
            case 7:
                //Выходными подразумеваю субботу и воскресенье
                if (labelHoliday) {
                    System.out.println("Это праздничный и, одновременно, выходной день!");
                } else {
                    System.out.println("Этот день является выходным, а выходные, как известно, - это маленький праздник.");
                }
                break;
            default:
                System.out.println("Это обычный будний день.");
                break;
        }
    }
}

class Holidays {
    String name;
    int dayOfMonth;
    int month;

    Holidays(String n, int d, int m) {
        this.name = n;
        this.dayOfMonth = d;
        this.month = m;
    }
}

