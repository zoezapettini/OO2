package ejercicio23.ej23;

public class Paused extends Etapa{
	
	public Paused(ToDoItem tarea) {
		super(tarea);
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		
	}
	
	public void togglePause() {
		this.getTarea().setEtapa(new InProgress(this.getTarea()));
	}
	
	public void finish() {
		this.getTarea().setEtapa(new Finished(this.getTarea()));
	}

}
