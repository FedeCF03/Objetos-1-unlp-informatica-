package ar.edu.info.unlp.oo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.oo.ejer12.PrismaRectangular;
import ar.edu.info.unlp.oo.ejer12.ReporteDeConstruccion;

public class ReporteDeConstruccionTest {
    
    ReporteDeConstruccion  reporteDeConstruccion;
    public ReporteDeConstruccionTest() {
    }

    	@BeforeEach
	public void setUp() {
        reporteDeConstruccion = new ReporteDeConstruccion();
    PrismaRectangular pieza = new PrismaRectangular(1, 2, 3, "10", "10");
        reporteDeConstruccion.addPieza(pieza);
	}

	@Test
    public void testReporte() {
        assertEquals(500, reporteDeConstruccion.volumenDeMaterial("madera"));
	}
}
