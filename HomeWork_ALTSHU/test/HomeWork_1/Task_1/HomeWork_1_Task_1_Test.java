package HomeWork_1.Task_1;

import HomeWork_1.Task_1.Deposit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HomeWork_1_Task_1_Test {
//    private Deposit deposit = new Deposit();

    @Test
    public void testIncomeCalc() {
        double sum = 1000;
        int per = 10;
        int st = 10;
        double expected = 1593.7424600999998;
        double actual;

        actual = Deposit.IncomeCalc(sum, per, st);

        assertEquals(expected, actual, 0.000);
    }


}
