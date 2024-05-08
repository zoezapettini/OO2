/**
 * 
 */
package ejercicio12.ejercicio12;
import ejercicio12.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio12.Archivo;
import ejercicio12.AspectoExtension;

public class PrettyPrintTest {
	
	Archivo archivo;
	AspectoNombre nombre;
	AspectoExtension extension;
	AspectoPermisos permiso;
	
	
	@BeforeEach
	void setUp() throws Exception {
		archivo= new Archivo("zoe", "permiso para escribir", 232.2, 323.2, LocalDate.now(),LocalDate.now());

	}
	
    @Test
    public void testPrettyPrint() {
		permiso= new AspectoPermisos(archivo);
		nombre= new AspectoNombre(permiso);
		extension= new AspectoExtension(nombre);
      System.out.println( extension.prettyPrint());
        
    }
}
