import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicSintaxis {

    @BeforeEach
    public void setup(){
        System.out.println("Esto se ejecuta antes de CADA test");
    }
    @AfterEach
    public void cleanup(){
        System.out.println("Esto se ejecuta despues de CADA test");
    }
    @Test
    public void verifyThing(){
        System.out.println("Esto es una prueba xd");

    }
    @Test
    public void verifyThing2(){
        System.out.println("Esto es una prueba 2");

    }
}
