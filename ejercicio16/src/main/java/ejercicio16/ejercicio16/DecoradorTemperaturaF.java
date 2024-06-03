package ejercicio16.ejercicio16;

public class DecoradorTemperaturaF  extends Decorator{
	
	public DecoradorTemperaturaF(HomeWeatherData t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
	
	public String displayData() {
		// TODO Auto-generated method stub
		return super.displayData()+ "; Temperatura F: " + this.getTemperatura();
	}

}
