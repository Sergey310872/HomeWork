package HomeWork_1.Task_4;

import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        String str=" ";

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = in.nextInt();

        long[] arr=new long[n+2];

        for(int i=1; i<=n; i++)
        {
            System.out.print("   " + (i) + ".введите значение: ");
            arr[i] = in.nextLong();
        }
        for(int i=1; i<=n; i++)
        {
            str=str+(arr[i-1]+arr[i]+arr[i+1])+"  ";
        }
        System.out.println("Ответ: "+str);
    }
}