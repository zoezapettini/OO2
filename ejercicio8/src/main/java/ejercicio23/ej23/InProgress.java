package ejercicio23.ej23;

public class InProgress extends Etapa{
	
	public InProgress(ToDoItem tarea) {
		super(tarea);
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		
	}
	
	public void togglePause() {
		this.getTarea().setEtapa(new Paused(this.getTarea()));
	}
	
	public void finish() {
		this.getTarea().setEtapa(new Finished(this.getTarea()));
	}

}
