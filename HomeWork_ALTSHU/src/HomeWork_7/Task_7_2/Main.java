package HomeWork_7.Task_7_2;


import java.util.Date;
import java.util.Scanner;

public class Main {
    static String currentItem = new String();
    static ThreadAgg threadAgg;
    static int choice;
    static long timeFinish = new Date().getTime() + 10000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (choice!=1 && choice!=2) {
            System.out.print("Курица - Яйцо\n Введите значение (1 - курица, 2 - яйцо): ");
            choice = in.nextInt();
        }
        System.out.println("Игра начинается:");
//        long timeStart = new Date().getTime();
//        long timeFinish = timeStart + 10000;

        ThreadAgg tAgg1 = new ThreadAgg("Курица");
        tAgg1.start();
        ThreadAgg tAgg2 = new ThreadAgg("       Яйцо");
        tAgg2.start();
        if (tAgg1.isAlive()) System.out.println("agg1");
        if (tAgg2.isAlive()) System.out.println("agg2");
        while ((tAgg1.isAlive()) || (tAgg2.isAlive())){
        }
        System.out.println("finish");
        String lastItem = (Main.choice == 1) ? "Курица" : "       Яйцо";
        if (!lastItem.equals(currentItem)) {
            System.out.println(lastItem);
        }
    }
}

class ThreadAgg extends Thread {
//    static String currentItem = new String();
    private String item;

    ThreadAgg(String it) {
        this.item = it;
    }

    @Override
    public void run() {
        while (Main.timeFinish > new Date().getTime()) {
            if ((!Main.currentItem.equals(item))) {
                Main.currentItem = item;
                System.out.println(Main.currentItem);
            }
        }
    }
}
