package Ejercicio2;

public class Generador {
    PrimoUtils primoUtils;

    public Generador(PrimoUtils primoUtils){
        this.primoUtils=primoUtils;
    }

    public String getNumberValues(int input) {

            String generador="";
        if(primoUtils.esPrimo(input)) {
            for(int i =1;i< input;i++) {

                if (i % 2 == 0) {
                    if (i == 2) {
                        generador = "2";
                    } else {
                        generador = generador + " " + i;
                    }
                }
            }
        } else {
            for(int i =1;i< input;i++){
                if(i % 2 != 0){
                    if(i==1){
                        generador = "1";
                    } else {
                        generador = generador + " " + i ;
                    }
                }
            }
        }
        return generador;
    }
}

