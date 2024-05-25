/**
 * 
 */
package ejercicio22.ejercicio22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubteWayTest {
	
	SubteWay director;
	ConstructorClasico constructorClasico;
	ConstructorVegetariano constructorVegetariano;
	ConstructorVegano constructorVegano;
	ConstructorSinTacc constructorSinTACC;
	
	@BeforeEach
	void setUp() throws Exception {
		constructorClasico= new ConstructorClasico();
		director= new SubteWay(constructorClasico);
		director.hacerSandwich();
		

	}
    @Test
    public void testCalcularCosto() {
    	assertEquals(500, constructorClasico.getSanguche().calcularCosto());
    	constructorVegetariano= new ConstructorVegetariano();
    	director.cambiarConstructor(constructorVegetariano);
    	director.hacerSandwich();
    	assertEquals(420, constructorVegetariano.getSanguche().calcularCosto());
    	constructorVegano= new ConstructorVegano();
    	director.cambiarConstructor(constructorVegano);
    	director.hacerSandwich();
    	assertEquals(620, constructorVegano.getSanguche().calcularCosto());
    	constructorSinTACC= new ConstructorSinTacc ();
    	director.cambiarConstructor(constructorSinTACC);
    	director.hacerSandwich();
    	assertEquals(618, constructorSinTACC.getSanguche().calcularCosto() );
    }
    	
    	
    	

        
        
    
}
