package ejercicio16.ejercicio16;

import java.util.List;

public class HomeWeatherStationAdapter  {
	
	private HomeWeatherStation adaptee;
	
	public HomeWeatherStationAdapter(HomeWeatherStation adaptee) {
		this.adaptee=adaptee;
		// TODO Auto-generated constructor stub
	}
	
	public double getPresion() {
		return this.adaptee.getPresion();
	}
	
	public double getRadiacionSolar() {
		return this.adaptee.getRadiacionSolar();
	}
	public double getTemperatura() {
		return this.adaptee.getTemperatura();
	}
	public List<Double> getTemperaturas() {
		return this.adaptee.getTemperaturas();
	}

	public String displayData(){
		return "Temperatura F: " + this.getTemperatura() +
		   	  "Presión atmosf: " + this.getPresion() +
		   	  "Radiación solar: " + this.getRadiacionSolar();
		}
	
	

}
