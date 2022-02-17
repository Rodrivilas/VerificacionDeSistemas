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
            "8,asddasd,2004,Mes incorrecto"



    })
    public void DateUtilsTest(int dia, String mes, int anio, String expectedResult){
        DateUtils dateUtils = new DateUtils();
        String actualResult=dateUtils.nextDate(dia,mes,anio);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! En DateUtils");
    }
}
