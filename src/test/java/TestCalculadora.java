import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculadora {

    Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void sumaTest() {
        int a, b, res, esp;

        a = 5;
        b = 7;
        esp = a + b;
        res = calculadora.suma(a, b);

        assertEquals(esp, res);
    }

    @Test
    public void restaTest() {
        int a, b, res, esp;

        a = 5;
        b = 7;
        esp = a - b;
        res = calculadora.resta(a, b);

        assertEquals(esp, res);
    }
}
