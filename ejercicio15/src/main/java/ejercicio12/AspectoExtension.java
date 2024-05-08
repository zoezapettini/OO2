package ejercicio12;

public class AspectoExtension extends Aspecto{
	
	public AspectoExtension(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String prettyPrint() {
		return  super.prettyPrint()+ "Extension: " + this.getExtension();
	}

}
