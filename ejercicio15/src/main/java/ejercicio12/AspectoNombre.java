package ejercicio12;

public class AspectoNombre extends Aspecto {
	
	public AspectoNombre(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Nombre: "+ this.getNombre();
	}
}
