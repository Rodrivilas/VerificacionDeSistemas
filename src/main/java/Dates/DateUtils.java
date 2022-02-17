package Dates;

public class DateUtils {



    public String nextDate(int fecha,String mes,int anio) {
        String mensaje = "";
        int errores = 0;

        if (fecha <= 0 || fecha > 31) {
            mensaje = "Dia incorrecto";
            errores++;
        }
        if (anio <= 0 || anio > 9999) {
            mensaje = "Anio incorrecto";
            errores++;
        }

        if(errores >1){
            mensaje="Ingresar nuevos datos";
        }else if(errores ==0) {
            if (mes.equals("Enero") && fecha >= 1 && fecha <= 31) {
                if (fecha == 31) {
                    mensaje = 1 + " Febrero " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Febrero") && fecha >= 1 && fecha <= bisiesto(anio)) {
                if (fecha == bisiesto(anio)) {
                    mensaje = 1 + " Marzo " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Marzo") && fecha >= 1 && fecha <= 31) {
                if (fecha == 31) {
                    mensaje = 1 + " Abril " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Abril") && fecha >= 1 && fecha <= 30) {
                if (fecha == 30) {
                    mensaje = 1 + " Mayo " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Mayo") && fecha >= 1 && fecha <= 31) {
                if (fecha == 31) {
                    mensaje = 1 + " Junio " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Junio") && fecha >= 1 && fecha <= 30) {
                if (fecha == 30) {
                    mensaje = 1 + " Julio " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Julio") && fecha >= 1 && fecha <= 31) {
                if (fecha == 31) {
                    mensaje = 1 + " Agosto " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Agosto") && fecha >= 1 && fecha <= 31) {
                if (fecha == 31) {
                    mensaje = 1 + " Septiembre " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Septiembre") && fecha >= 1 && fecha <= 30) {
                if (fecha == 30) {
                    mensaje = 1 + " Octubre " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Octubre") && fecha >= 1 && fecha <= 31) {
                if (fecha == 31) {
                    mensaje = 1 + " Noviembre " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Noviembre") && fecha >= 1 && fecha <= 30) {
                if (fecha == 30) {
                    mensaje = 1 + " Diciembre " + anio;
                } else {
                    mensaje = fecha + 1 + " " + mes + " " + anio;
                }
            } else if (mes.equals("Diciembre") && fecha >= 1 && fecha <= 31) {
                if (fecha == 31) {
                    mensaje = 1 + " Enero " + (anio + 1);
                } else {
                    mensaje = fecha + 1 + " " + mes + " " +anio;
                }
            }else{
                mensaje = "Mes incorrecto";
            }
        }
        return mensaje;
    }


    private static int bisiesto(int anio) {
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            return 29;
        else
            return 28;
    }
}
