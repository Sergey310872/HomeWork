package HomeWork_6;

import HomeWork_0.ScannerHW;
import HomeWork_6.Task_6_5.Main;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class newTestHomeWork_6_5 {
    private static ScannerHW scannerHW = mock(ScannerHW.class);

    @Test
    public void testMain() {
        //given
        String[] args= new String[0];

        when(scannerHW.scannerLine()).thenReturn("25121985", "2001-01-23", "2011-12-31", "2010-03-25", "2000-01-01");
        //when
        Main.setScannerHW(scannerHW);
        for (int i=1; i<5; i++){
            Main.main(args);
        }
        //then
        verify(scannerHW, times(5)).scannerLine();
    }

}
