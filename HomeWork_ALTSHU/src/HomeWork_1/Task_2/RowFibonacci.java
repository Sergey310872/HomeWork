package HomeWork_1.Task_2;

//import HomeWork_0;
import HomeWork_0.ScannerHW;

import java.util.Scanner;

public class RowFibonacci {
    public static void main(String[] args)
    {
//        Scanner in = new Scanner(System.in);
        System.out.print("Введите порядковый номер числа Фибоначчи: ");
//        long n = in.nextInt();
        ScannerHW scannerHW = new ScannerHW();
        int n = scannerHW.scannerInt();

        long nFib=0, n1=1, n2=0;
        if(n==1){nFib=0;}
        else if (n==2) {nFib=1;}
        else {
            for (long i = 3; i <= n; i++) {
                nFib = n1 + n2;
                n2 = n1;
                n1 = nFib;
                //               System.out.println("       : " + i + "-е число Фибоначчи: " + nFib);
            }
        }

        System.out.println("Ответ: "+n+"-е число Фибоначчи: "+nFib);
    }
}