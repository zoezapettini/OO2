package ejercicio12;

public class AspectoPermisos extends Aspecto {
	
	public AspectoPermisos(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override	
	public String prettyPrint() {
		return  super.prettyPrint() +  "Permisos: " +this.getPermisos();
	}
}
