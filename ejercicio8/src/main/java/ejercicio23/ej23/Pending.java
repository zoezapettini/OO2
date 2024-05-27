package ejercicio23.ej23;

public class Pending extends Etapa{
	
	public Pending(ToDoItem tarea) {
		super(tarea);
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		this.getTarea().setEtapa(new InProgress(this.getTarea()));
	}
	
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");

	}

	public void finish() {
		
	}
}
