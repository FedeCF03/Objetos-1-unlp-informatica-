package ar.edu.info.unlp.oo.ejer13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
    Email email;
    Carpeta carpeta;

    @BeforeEach
    public void setUp() {
        email = new Email("123456", "123456");
        email.agregarAdjunto(new Archivo("123456"));
        email.agregarAdjunto(new Archivo("12345678"));
        carpeta = new Carpeta("Carpeta");
        carpeta.agregar(email);
    }

    @Test
    public void test() {
        assertEquals(email, carpeta.buscar("123456"));
        assertEquals(null, carpeta.buscar("s123nj456"));

    }
}
