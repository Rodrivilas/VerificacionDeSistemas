package ejercicio3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CambioMockTest {
    CambioMoneda cambioMonedamock= Mockito.mock(CambioMoneda.class);



    @Test
    public void generadorTestPrimo(){
        Mockito.when(cambioMonedamock.convert("dolar","boliviano")).thenReturn(7);
        Cambios cambios= new Cambios(cambioMonedamock);
        String expectedResult = "[70] boliviano";
        String actualResult = cambios.realizarCambio(10,"dolar","boliviano");
        Assertions.assertEquals(expectedResult,actualResult,"Error cambio");
        Mockito.verify(cambioMonedamock).convert("dolar","boliviano");
    }

    @Test
    public void generadorTestPrimoEuro(){
        Mockito.when(cambioMonedamock.convert("euro","boliviano")).thenReturn(9);
        Cambios cambios= new Cambios(cambioMonedamock);
        String expectedResult = "[90] boliviano";
        String actualResult = cambios.realizarCambio(10,"euro","boliviano");
        Assertions.assertEquals(expectedResult,actualResult,"Error cambio");
        Mockito.verify(cambioMonedamock).convert("euro","boliviano");
    }

    @Test
    public void generadorTestPrimoError(){
        Mockito.when(cambioMonedamock.convert("euro","boliviano")).thenReturn(9);
        Cambios cambios= new Cambios(cambioMonedamock);
        String expectedResult = "Introduzca un monto valido";
        String actualResult = cambios.realizarCambio(-100,"euro","boliviano");
        Assertions.assertEquals(expectedResult,actualResult,"Error cambio");
       // Mockito.verify(cambioMonedamock).convert("euro","boliviano");
    }
}
