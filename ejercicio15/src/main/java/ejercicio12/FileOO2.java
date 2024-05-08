package ejercicio12;

import java.time.LocalDate;

public interface FileOO2 {

	
	public String getNombre();
	public double getExtension();
	public LocalDate getFechaDeCreacion();
	public LocalDate getFechaDeModificacion();
	public String getPermisos();
	public double getTamaño();
	
	public String prettyPrint();
	

}
