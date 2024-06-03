package repaso.ejercicio9repaso;
import java.time.*;
import java.util.*;
public class Excursion {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo, cupoMaximo;
	private Etapa etapa;
	private List<Usuario> inscriptos,listaDeEspera;
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String ptoEncuentro, double costo, int cupoMin, int cupoMax) {
		this.nombre=nombre;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.puntoDeEncuentro=ptoEncuentro;
		this.costo=costo;
		this.cupoMaximo=cupoMax;
		this.cupoMinimo=cupoMin;
		this.etapa= new Provisoria();
		this.inscriptos= new ArrayList<Usuario>();
		this.listaDeEspera= new ArrayList<Usuario>();
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void inscribirse(Usuario usuario) {
		this.etapa.inscribirse(this, usuario);
	}
	
	public boolean llegoAlMaximo() {
		return (this.inscriptos.size() +1)==this.cupoMaximo;
	}
	
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	
	public void añadirInscripto(Usuario usuario) {
		this.inscriptos.add(usuario);
	}
	
	public boolean llegoAlMinimo() {
		return (this.inscriptos.size()+1) == this.cupoMinimo;
	}
	
	public void añadirALista(Usuario usuario) {
		this.listaDeEspera.add(usuario);
	}
	
	public String toString() {
		return "Nombre: " + this.nombre + "Costo: "+ this.costo + "Fecha inicio: "+ this.fechaInicio + "Fecha fin: "+ this.fechaFin+ "Punto de encuentro "+ this.puntoDeEncuentro;
	}
	public List<Usuario> getListaDeEspera() {
		return listaDeEspera;
	}
	
	public int faltantesMaximo() {
		return this.cupoMaximo - this.inscriptos.size();
	}
	
	public int faltantesMinimo() {
		return this.cupoMinimo - this.inscriptos.size();
	}
	public List<Usuario> getInscriptos() {
		return inscriptos;
	}
	public String mailsInscriptos() {
		return this.inscriptos.stream().map(inscripto -> inscripto.getMail())
					.reduce("",(acumulator, element)-> acumulator +"\n" + element);
	}
	public Etapa getEtapa() {
		return etapa;
	}

	public String infoExcursion() {
		return this.etapa.infoExcursion(this);
	}
}
