package ejercicio12;

import java.time.LocalDate;

public class Aspecto implements FileOO2{
	
	private FileOO2 file;
	
	public Aspecto(FileOO2 file) {
		this.file=file;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String prettyPrint() {
		return this.getFile().prettyPrint();
	}
	
	
	public FileOO2 getFile() {
		return file;
	}

	
	
	@Override
	public double getExtension() {
		// TODO Auto-generated method stub
		return this.file.getExtension();
	}
	@Override
	 public LocalDate getFechaDeCreacion() {
		return this.file.getFechaDeCreacion();
	}
	@Override
	 public LocalDate getFechaDeModificacion() {
		return this.file.getFechaDeModificacion();
	}
	@Override
	 public String getNombre() {
		return this.file.getNombre();
	}
	@Override
	 public String getPermisos() {
		return this.file.getPermisos();
	}
	@Override
	 public double getTamaño() {
		return this.file.getTamaño();
	}
}
