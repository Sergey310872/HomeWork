package HomeWork_2.Task_2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exceptional();
    }

    private static void exceptional(){
        Scanner in=new Scanner(System.in);
        String str;
        try {
            do {
                System.out.println("Введите строку: ");
                str = in.nextLine();
            }while (!str.toLowerCase().equals("отстань от меня, пожалуйста"));
            throw new Exception();
        }catch (Exception a){
            System.out.println("Ха-ха! Попался! я поймал исключение");
            System.out.println("До свидания!");
        }
    }
}