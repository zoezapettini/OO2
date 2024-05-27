/**
 * 
 */
package ejercicio23.ej23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	ToDoItem tarea;
	
	
	@BeforeEach
	void setUp() throws Exception {
		tarea= new ToDoItem("practicar objetos");
			}
    @Test
    public void test() {
    	tarea.start();
    	assertTrue(tarea.getEtapa() instanceof InProgress);
    	tarea.togglePause();
    	assertTrue(tarea.getEtapa() instanceof Paused);
    	tarea.finish();
    	tarea.togglePause();
    	assertTrue(tarea.getEtapa() instanceof Finished);
    	
        
    }
}
