package HomeWork_1.Task_1;

import java.util.Scanner;

public class Deposit {
    private final static int TAX = 13;
    private final static int TAX_DEDUCTION = 42500;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные для расчета:");
        System.out.print("   Вносимая сумма, руб.коп: ");
        double sumIn = in.nextDouble();
        System.out.print("   Срок хранения средств, лет: ");
        int period = in.nextInt();
        System.out.print("   Процентная ставка, % годовых: ");
        int rate = in.nextInt();

        System.out.println("Процентный доход для вклада под "+ rate +"% годовых составит "
                +IncomeCalc(sumIn,period,rate)+" руб");
    }

    public static double IncomeCalc(double sum, int per, int st)
    {
        double incY;
        double tax;
        double sumD=sum;

        for(int i=1; i<=per; i++)
        {
            incY=sumD*(double) st/100;
            tax =(incY-TAX_DEDUCTION)*TAX/100;
            tax =((tax<0) ? 0:tax);
            sumD+=incY-tax;
            //   System.out.println("      "+incY+"/"+tax+"/"+sumD);
        }
        return sumD-sum;
    }

}
