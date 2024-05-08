package ejercicio16.ejercicio16;
import java.util.*;
public class HomeWeatherStation {
	
	private double temperatura, presion, radiacionSolar;
	private List<Double> temperaturas;
	
	public HomeWeatherStation(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
		this.temperatura=temperatura;
		this.presion=presion;
		this.radiacionSolar=radiacionSolar;
		this.temperaturas= temperaturas;
		// TODO Auto-generated constructor stub
	}
	
	public double getPresion() {
		return presion;
	}
	
	public double getRadiacionSolar() {
		return radiacionSolar;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public List<Double> getTemperaturas() {
		return temperaturas;
	}

	public String displayData(){
		return "Temperatura F: " + this.getTemperatura() +
		   	  "Presión atmosf: " + this.getPresion() +
		   	  "Radiación solar: " + this.getRadiacionSolar();
		}

}
