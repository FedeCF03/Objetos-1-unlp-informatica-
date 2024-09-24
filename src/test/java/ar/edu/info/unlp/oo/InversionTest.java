package ar.edu.info.unlp.oo;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionTest {
    private InversionEnAcciones inversionEnAcciones; 
    private PlazoFijo plazofijo;
    private Inversor inversor= new Inversor("fede");
    
	@BeforeEach
    public void setUp() {
         plazofijo = new PlazoFijo(LocalDate.now(), 1000, 0.1);
         inversionEnAcciones = new InversionEnAcciones("ypf", 5, 1000);
        inversor.agregarInversion(plazofijo);
        inversor.agregarInversion(inversionEnAcciones);

    }   
	

	@Test
	public void Operaciones() {
        assertEquals(6000, inversor.valorInversiones());

    }

}
