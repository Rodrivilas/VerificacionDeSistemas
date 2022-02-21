package ejercicio2mockstatic;

public class GeneradorMockStatic {
    public GeneradorMockStatic() {
    }

    public String getNumberValues(int input){
        String generador="";
        boolean primo = PrimoUtilsMockStatic.esPrimo(input);
        if(primo) {
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
