package ejercicio23.ej23;

public abstract class Etapa {
	
	private ToDoItem tarea;
	
	public Etapa(ToDoItem tarea) {
		this.tarea= tarea;
		// TODO Auto-generated constructor stub
	}
	
	public ToDoItem getTarea() {
		return this.tarea;
	}
	
	public abstract void start();
	public abstract void togglePause();
	public abstract void finish();

}
