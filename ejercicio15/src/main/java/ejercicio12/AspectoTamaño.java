package ejercicio12;

public class AspectoTamaño extends Aspecto  {
	
	public AspectoTamaño(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String prettyPrint() {
		return  super.prettyPrint() +"Tamaño " + +this.getTamaño();
	}
	
	

}
