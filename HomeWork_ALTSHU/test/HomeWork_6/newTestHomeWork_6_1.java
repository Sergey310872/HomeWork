package HomeWork_6;

import HomeWork_0.ScannerHW;
import HomeWork_6.Task_6_1.Main;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class newTestHomeWork_6_1 {
    private static ScannerHW scannerHW = mock(ScannerHW.class);

    @Test
    public void testMain() {
        //given
        String[] args= new String[0];

        when(scannerHW.scannerLine()).thenReturn("25121985", "2022-11-02");

        //when
        Main.setScannerHW(scannerHW);
        Main.main(args);
        //then
        verify(scannerHW, times(2)).scannerLine();
    }
}
