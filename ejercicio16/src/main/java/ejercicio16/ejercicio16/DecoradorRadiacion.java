package ejercicio16.ejercicio16;

public class DecoradorRadiacion extends Decorator{
	
	public DecoradorRadiacion(HomeWeatherData temp) {
		super(temp);
		// TODO Auto-generated constructor stub
	}
	
	
	public String displayData() {
		// TODO Auto-generated method stub
		return super.displayData() + "; Radiacion solar: " + this.getRadiacionSolar();
	}

}
