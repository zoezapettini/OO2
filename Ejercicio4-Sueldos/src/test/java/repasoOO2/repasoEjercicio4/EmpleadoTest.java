/**
 * 
 */
package repasoOO2.repasoEjercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	Temporario temporarioNoCasado, temporarioCasado;
	Pasante pasanteSinExamen, pasanteConExamen;
	Planta planta;
	
	@BeforeEach
	void setUp() throws Exception {
		temporarioNoCasado= new Temporario(false, 2, 3);
		temporarioCasado= new Temporario(true, 2, 3);
		pasanteConExamen= new Pasante(4);
		pasanteSinExamen=new Pasante(0);
		planta= new Planta(true, 3, 6);
	}
    @Test
    public void testSueldoTemporario() {
    	assertEquals(21983, temporarioNoCasado.sueldo());
    	assertEquals(((temporarioCasado.sueldoBasico() + temporarioCasado.adicional() )-  temporarioCasado.descuento()), temporarioCasado.sueldo());
    }
    
    @Test
    public void testPasante() {
    	assertEquals(25000, pasanteConExamen.sueldo());
    	assertEquals(17400, pasanteSinExamen.sueldo());
    }
    
    @Test
    public void testPlanta() {
    	assertEquals(65350, planta.sueldo());
    }
}
