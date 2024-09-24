package ar.edu.info.unlp.oo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
    private CajaDeAhorro caja;
    private CuentaCorriente cuenta;
    
	@BeforeEach
    public void setUp() {
        caja = new CajaDeAhorro();
        caja.depositar(80);
        cuenta = new CuentaCorriente(100);
        cuenta.depositar(100);
    }   
	

	@Test
	public void Operaciones() {
		assertEquals(true, caja.extraer(30));
        assertEquals(true, caja.transferirACuenta(30, caja));
        assertEquals(false, caja.transferirACuenta(1070, caja));
        assertEquals(false, cuenta.extraer(1000));
       
    }
}
