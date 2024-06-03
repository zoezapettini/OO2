/**
 * 
 */
package repaso.ejercicio9repaso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	
	Excursion excursion;
	Usuario oe, facundo, sandra;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		oe= new Usuario("oe", "zapettini", "zoe@gmail.com");
		facundo= new Usuario("facundito", "feliu", "");
		sandra= new Usuario("sandra", "papasodaro", "@gmail.com");
		excursion= new Excursion ("Dos dias en kayak bajando el Paraná", LocalDate.now(), LocalDate.now(), "Plaza moreno", 23232.2, 1, 2);
		excursion.inscribirse(oe);
		excursion.inscribirse(facundo);
	}
    @Test
    public void inscribirTest() {
        excursion.inscribirse(sandra);
       assertFalse(excursion.getInscriptos().contains(sandra));
       assertTrue(excursion.getListaDeEspera().contains(sandra));
       assertTrue(excursion.getEtapa() instanceof Llena);
        
    }
}