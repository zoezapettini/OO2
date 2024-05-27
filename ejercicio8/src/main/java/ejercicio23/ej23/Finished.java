package ejercicio23.ej23;

public class Finished extends Etapa{
	
	public Finished(ToDoItem tarea) {
		super(tarea);
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		
	}
	
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");

	}
	
	public void finish() {
		
	}
	
	

}
