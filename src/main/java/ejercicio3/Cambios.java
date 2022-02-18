package ejercicio3;

public class Cambios {
    CambioMoneda cambioMoneda;

    public Cambios(CambioMoneda cambioMoneda) {
        this.cambioMoneda = cambioMoneda;
    }

    public String realizarCambio(int dinero, String moneda1, String moneda2){
        if(dinero>0) {
            int cambio = dinero * cambioMoneda.convert(moneda1, moneda2);
            return "[" + cambio + "] " + moneda2;
        }else{
            return "Introduzca un monto valido";
        }
    }
}
