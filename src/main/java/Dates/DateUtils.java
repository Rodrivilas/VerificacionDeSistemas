package Dates;

public class DateUtils {



    public String nextDate(int fecha,String mes,int anio){
        if(fecha ==0 || fecha >31){
            return "Dia incorrecto";
        }
        if(anio ==0 || anio >9999){
            return "Anio incorrecto";
        }
        if(mes.equals("Enero") && fecha>=1 && fecha <=31){
            if(fecha == 31){
                return 1 +" Febrero " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Febrero") && fecha>=1 && fecha <= bisiesto(anio)){
            if(fecha == bisiesto(anio)){
                return 1 +" Marzo " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Marzo") && fecha>=1 && fecha <= 31){
            if(fecha == 31){
                return 1 +" Abril " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Abril") && fecha>=1 && fecha <= 30){
            if(fecha == 30){
                return 1 +" Mayo " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Mayo") && fecha>=1 && fecha <= 31){
            if(fecha == 31){
                return 1 +" Junio " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Junio") && fecha>=1 && fecha <= 30){
            if(fecha == 30){
                return 1 +" Julio " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Julio") && fecha>=1 && fecha <= 31){
            if(fecha == 31){
                return 1 +" Agosto " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Agosto") && fecha>=1 && fecha <= 31){
            if(fecha == 31){
                return 1 +" Septiembre " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Septiembre") && fecha>=1 && fecha <= 30){
            if(fecha == 30){
                return 1 +" Octubre " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Octubre") && fecha>=1 && fecha <= 31){
            if(fecha == 31){
                return 1 +" Noviembre " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Noviembre") && fecha>=1 && fecha <= 30){
            if(fecha == 30){
                return 1 +" Diciembre " +anio;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }else if(mes.equals("Diciembre") && fecha>=1 && fecha <= 31){
            if(fecha == 31){
                return 1 +" Enero " + anio+1;
            }else{
                return fecha+1 + " "+ mes + " "+anio;
            }
        }

        return "Mes incorrecto";
    }


    private static int bisiesto(int anio) {
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            return 29;
        else
            return 28;
    }
}
