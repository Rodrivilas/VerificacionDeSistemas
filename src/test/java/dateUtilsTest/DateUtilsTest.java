package dateUtilsTest;


import Dates.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DateUtilsTest {
    @Test
    @ParameterizedTest
    @CsvSource({
            "3,Enero,2004,4 Enero 2004",
            "31,Enero,2005,1 Febrero 2005",
            "28,Febrero,2020,29 Febrero 2020",
            "28,Febrero,2001,1 Marzo 2001",
            "64,Enero,2004,Dia incorrecto",
            "8,Enero,32004,Anio incorrecto",
            "8,Abril,2004,9 Abril 2004",
            "8,Junio,2004,9 Junio 2004",
            "8,Julio,2004,9 Julio 2004",
            "8,Agosto,2004,9 Agosto 2004",
            "8,Septiembre,2004,9 Septiembre 2004",
            "8,Octubre,2004,9 Octubre 2004",
            "8,Noviembre,2004,9 Noviembre 2004",
            "8,Diciembre,2004,9 Diciembre 2004",
            "31,Diciembre,2004,1 Enero 2005",
            "31,ssadsda,2004,Mes incorrecto",
            "65,Febrero,300212,Ingresar nuevos datos"






    })
    public void DateUtilsTestm(int dia, String mes, int anio, String expectedResult){
        DateUtils dateUtils = new DateUtils();
        String actualResult=dateUtils.nextDate(dia,mes,anio);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! En DateUtils");
    }
}
