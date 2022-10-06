package HomeWork_2.Task_2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Что бы поделать?");
        String str=in.nextLine();
        while (!str.equals("Ничего не делай")) {
            System.out.println("Что бы еще поделать?");
            str=in.nextLine();
        }
        System.out.println("Пойду бездельничать");
    }

}
