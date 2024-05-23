/**
 * 
 */
package Ejercicio19.ej19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajeTest {
	
	Mago mago;
	Arquero arquero;
	Guerrero guerrero;
	CreadorArquero creadorArquero;
	CreadorMago creadorMago;
	CreadorGuerrero creadorGuerrero;
	
	@BeforeEach
	void setUp() throws Exception {
		creadorArquero= new CreadorArquero();
		creadorGuerrero= new CreadorGuerrero();
		creadorMago= new CreadorMago();
		arquero= creadorArquero.crearPersonaje("Un Arquero");
		mago= creadorMago.crearPersonaje("Personaje mago");
		guerrero= creadorGuerrero.crearPersonaje("Personaje guerero");
		
		
	}
    @Test
    public void testDarCombate() {
    	mago.darCombate(arquero);
    	assertEquals(arquero.getPtosVida(), 98);
    	assertEquals(mago.getPtosVida(), 100);
    	arquero.darCombate(mago);
    	assertEquals(mago.getPtosVida(), 95);
    	guerrero.darCombate(mago);
    	assertEquals(mago.getPtosVida(), 87);
        
    }
}
