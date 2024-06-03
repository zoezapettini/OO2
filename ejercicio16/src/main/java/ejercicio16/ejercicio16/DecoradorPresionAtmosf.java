package ejercicio16.ejercicio16;

public class DecoradorPresionAtmosf extends Decorator {

	public DecoradorPresionAtmosf(HomeWeatherData temp) {
		super(temp);
		// TODO Auto-generated constructor stub
	}
	
	
	public String displayData() {
		// TODO Auto-generated method stub
		return super.displayData() + "; Presión atmosf: " + this.getPresion();
	}
}
