package ejercicio12;

import java.time.LocalDate;

public class Archivo implements FileOO2{
	
	private String nombre, permisos;
	private double extension,tamaño;
	private LocalDate fechaDeCreacion, fechaDeModificacion;
	
	 public Archivo(String nombre, String permisos, double extension, double tamaño, LocalDate fechaDeCreacion, LocalDate fechaDeModificacion) {
		 this.nombre=nombre;
		 this.permisos=permisos;
		 this.extension=extension;
		 this.fechaDeCreacion=fechaDeCreacion;
		 this.fechaDeModificacion=fechaDeModificacion;
		// TODO Auto-generated constructor stub
	}
	 
	 public String prettyPrint() {
		return  "Datos";
	 }
	
	 
	public double getExtension() {
		// TODO Auto-generated method stub
		return this.extension;
	}
	 public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	 public LocalDate getFechaDeModificacion() {
		return fechaDeModificacion;
	}
	 public String getNombre() {
		return nombre;
	}
	 public String getPermisos() {
		return permisos;
	}
	 public double getTamaño() {
		return tamaño;
	}
	 
	 
	 
	

}
