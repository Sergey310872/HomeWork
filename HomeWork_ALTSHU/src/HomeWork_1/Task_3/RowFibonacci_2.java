package HomeWork_1.Task_3;

import java.util.Scanner;

public class RowFibonacci_2
{
    public static void main(String[] args)
    {
        String listF=" ";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество проверяемых чисел: ");
        int n = in.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("   "+(i+1)+".введите значение: ");
            long nF=in.nextLong();

            long nFib=0, n1=1, n2=0;

            if(nF==0){listF=listF+"0, ";}
            else if (nF==1) {listF=listF+"1, ";}
            else
            {
                while ( nFib<nF)
                {
                    nFib = n1 + n2;
                    n2 = n1;
                    n1 = nFib;
                }
                listF=listF+(nFib==nF? (nF+", "):"");
            }
        }
        System.out.println("Числами Фибоначчи являются: "+listF);
    }
}