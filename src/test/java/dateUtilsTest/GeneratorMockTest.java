package dateUtilsTest;


import Ejercicio2.Generador;
import Ejercicio2.PrimoUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratorMockTest {


    PrimoUtils primoUtilsMock= Mockito.mock(PrimoUtils.class);



    @Test
    public void generadorTestPrimo(){
        Mockito.when(primoUtilsMock.esPrimo(13)).thenReturn(true);
        Generador generador= new Generador(primoUtilsMock);
        String expectedResult = "2 4 6 8 10 12";
        String actualResult = generador.getNumberValues(13);
        Assertions.assertEquals(expectedResult,actualResult,"Error generadorTestPrimos");
        Mockito.verify(primoUtilsMock).esPrimo(13);
    }

    @Test
    public void generadorTest(){
        Mockito.when(primoUtilsMock.esPrimo(8)).thenReturn(false);
        Generador generador= new Generador(primoUtilsMock);
        String expectedResult = "1 3 5 7";
        String actualResult = generador.getNumberValues(8);
        Assertions.assertEquals(expectedResult,actualResult,"Error generadorTest");
        Mockito.verify(primoUtilsMock).esPrimo(8);
    }
}
