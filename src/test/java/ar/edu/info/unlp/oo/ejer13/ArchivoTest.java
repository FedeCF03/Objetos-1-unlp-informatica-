package ar.edu.info.unlp.oo.ejer13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {
    private Archivo archivo;

    @BeforeEach
    public void setUp() {
        archivo = new Archivo("archivo1");
    }

    @Test
    public void testTamanio() {
        assertEquals(8, archivo.getTamanio());
    }

}
