package ejercicio12;

public class AspectoFechaDeCreacion extends Aspecto {
	
	public AspectoFechaDeCreacion(FileOO2 file){
		super(file);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String prettyPrint() {
		return  super.prettyPrint()+"Fecha de creacion: "+ this.getFechaDeCreacion();
	}
	

}
