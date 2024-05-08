package ejercicio12;

public class AspectoFechaDeModificacion extends Aspecto{
	
	public AspectoFechaDeModificacion(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return "Fecha de modificacion " + super.prettyPrint()+ "Fecha de modificacion " + this.getFechaDeModificacion();
	}
	
	
}
