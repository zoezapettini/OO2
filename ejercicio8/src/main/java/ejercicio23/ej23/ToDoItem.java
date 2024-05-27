package ejercicio23.ej23;
import java.time.Duration;
import java.util.*;
public class ToDoItem {
	
	private String nombre;
	private List<String> comentarios;
	private Etapa etapa;
	
	public ToDoItem(String nombre) {
		this.nombre=nombre;
		this.comentarios= new ArrayList<String>();
		this.etapa= new Pending(this);
		// TODO Auto-generated constructor stub
	}
	
	public Etapa getEtapa() {
		return this.etapa;
	}
	
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
   	/**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
        public void start() {
        	this.getEtapa().start();
        }

	/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/
        public void togglePause() {
        	this.getEtapa().togglePause();
        }


	/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
* in-progress o paused. Si se encuentra en otro estado, no hace nada.
*/
        public void finish() {
        	this.getEtapa().finish();
        }


	/**
* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
* genera un error informando la causa específica del mismo.
*/
     //   public Duration workedTime() {
       // 	return 2;
     //   }


/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
* contrario no hace nada."
*/


        public void addComment(String comment) {
        	this.comentarios.add(comment);
        	
        }
public List<String> getComentarios() {
	return comentarios;
}
}
