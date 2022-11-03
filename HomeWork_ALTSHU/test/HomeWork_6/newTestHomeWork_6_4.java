package HomeWork_6;

import HomeWork_0.ScannerHW;
import HomeWork_6.Task_6_4.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class newTestHomeWork_6_4 {
    private static ScannerHW scannerHW = mock(ScannerHW.class);

    @Test
    public void testMain() {
        //given
        String[] args= new String[0];

        when(scannerHW.scannerInt()).thenReturn(172, 368);

        //when
        Main.setScannerHW(scannerHW);
        Main.main(args);
        //then
        verify(scannerHW, times(2)).scannerInt();
    }

    @Test
    public void testNumberTimeZone(){
        //given
        int number = 600;
        String title = "Введите индекс 1-й временной зоны в диапазоне от 0 до ";
//        int timeZone_1 = NumberTimeZone("Введите индекс 1-й временной зоны в диапазоне от 0 до ", number);

        when(scannerHW.scannerInt()).thenReturn(172);
        //when
        Main.setScannerHW(scannerHW);
        int actual = Main.NumberTimeZone(title, number);
        //then
        assertEquals(172, actual);
        verify(scannerHW, times(1)).scannerInt();
    }
}
