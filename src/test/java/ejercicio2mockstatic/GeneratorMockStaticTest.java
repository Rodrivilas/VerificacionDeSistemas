package ejercicio2mockstatic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class GeneratorMockStaticTest {
    @BeforeAll
    public static void before(){
        MockedStatic<PrimoUtilsMockStatic> objMock= Mockito.mockStatic(PrimoUtilsMockStatic.class);
        objMock.when(()-> PrimoUtilsMockStatic.esPrimo(8)).thenReturn(false);
        objMock.when(()-> PrimoUtilsMockStatic.esPrimo(13)).thenReturn(true);


    }
    @Test
    public void generadorTestPrimo(){
        GeneradorMockStatic generadorMockStatic= new GeneradorMockStatic();
        String expected="2 4 6 8 10 12";
        String actual= generadorMockStatic.getNumberValues(13);
        Assertions.assertEquals(expected,actual,"ERROR");
    }
    @Test
    public void generadorTestNoPrimo(){
        GeneradorMockStatic generadorMockStatic= new GeneradorMockStatic();
        String expected="1 3 5 7";
        String actual= generadorMockStatic.getNumberValues(8);
        Assertions.assertEquals(expected,actual,"ERROR");
    }


}
