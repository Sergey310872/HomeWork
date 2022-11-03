package HomeWork_5;

import HomeWork_0.ScannerHW;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@Ignore
public class newTestHomeWork_5 {
    private static ScannerHW scannerHW = mock(ScannerHW.class);
    private static Service service = new Service(scannerHW);
    private static Repository repository = new Repository();
    //Первичная инициализация репозитория
    @Before
    public void prepareTestData()
    {
        service.setRepository("+79218001111", new Person("+79218001111", "Иванов Иван Иванович"));
        service.setRepository("+79218002222", new Person("+79218002222", "Петров Иван Петрович"));
        service.setRepository("+79218003333", new Person("+79218003333", "Сидоров Иван Иванович"));
        service.setRepository("+79218004444", new Person("+79218004444", "Иванов Иван Иванович", "address@mail.ru", "г.Москва"));
        service.setRepository("+79218005555", new Person("+79218005555", "Fedor"));
    }

    @Test
    public void testServiceMainMenu() {
        //given
        Integer n=2;

        when(scannerHW.scannerInt()).thenReturn(n);

        //when
        int actual = service.mainMenu();
        //then
        assertEquals((int) n, actual);
        verify(scannerHW,times(1)).scannerInt();
    }

    @Test
    public void testListOfPersonsAndData(){
        //given
        //when
        service.listOfPerson();
        //then
    }

    @Test
    public void testChangePersonNaimByThePhone(){
        //given
        String name = "Спиридонов О.Ю.";
        String phoneNumber = "+79218001111";
        when(scannerHW.scannerInt()).thenReturn(2, 2, 1, 1);
        when(scannerHW.scannerLine()).thenReturn(phoneNumber, name);
        //when
        service.changePersonData();
        Repository rep = service.getRepository();
        String actualName = rep.getRepPerson(phoneNumber).getNameAndSurname();
        //then
        assertEquals(name, actualName);
        verify(scannerHW, times(4)).scannerInt();
        verify(scannerHW, times(2)).scannerLine();
    }

    @Test
    public void testWorkForSearchPersonByNameAndShowTheList(){
        //given
        String name = "Петров";
        String phoneNumber = "+79218001111";
        when(scannerHW.scannerInt()).thenReturn(2, 1, 1, 1, 1, 6);
        when(scannerHW.scannerLine()).thenReturn(name);
        //when
        service.work();
        //then
        verify(scannerHW, times(6)).scannerInt();
        verify(scannerHW, times(1)).scannerLine();
    }
}
