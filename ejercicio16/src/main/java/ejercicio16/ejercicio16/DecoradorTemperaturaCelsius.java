package ejercicio16.ejercicio16;

public class DecoradorTemperaturaCelsius extends Decorator {
	
	 public DecoradorTemperaturaCelsius(HomeWeatherData temp) {
		 super(temp);
		// TODO Auto-generated constructor stub
	}
	 
	 public String displayData() {
		 return super.displayData() + "; Temperatura C " + this.gradosCelsius();
	 }

	 
	 private double gradosCelsius() {
		 return (this.getTemperatura()-32 ) / 1.8;
	 }
	 
	 
}
