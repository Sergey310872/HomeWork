package HomeWork_3.Task_3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите три целых числа:");
        System.out.print("1 число - это число, которое является началом последовательности: ");
        int n1=in.nextInt();
        System.out.print("2 число - это число, которое является концом последовательности: ");
        int n2=in.nextInt();
        System.out.print("3 число - это число для сверки кратности: ");
        int n3=in.nextInt();

        System.out.println("Все целые числа в промежутке от 1-го до последнего включительно, которые кратны 3-му числу: ");
        if (n1<=n2) {
            int n=n1;
            while (n <= n2) {
                if ((n%n3)==0){
                    System.out.print(" "+n);
                }
                n=n+1;
            }
        }else {
            System.out.println("1 число не может быть больше 2 числа.");
        }
    }
}
