package ar.edu.info.unlp.oo.ejer13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
    private Email email;

    @BeforeEach
    public void setUp() {
        email = new Email("123456", "123456");
        email.agregarAdjunto(new Archivo("123456"));
        email.agregarAdjunto(new Archivo("12345678"));

    }

    @Test
    public void testTamanio() {
        assertEquals(26, email.getTamanio());
    }

}
