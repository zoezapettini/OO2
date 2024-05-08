package ejercicio16.ejercicio16;

import java.util.List;

public class Decorator implements Temperatura{
	
	private Temperatura temperatura;
	
	public Decorator(Temperatura temperatura) {
		this.temperatura=temperatura;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getTemperatura() {
		return this.temperatura.getTemperatura();
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return this.temperatura.getPresion();
	}
	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return this.temperatura.getRadiacionSolar();
	}
	@Override
	public List<Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return this.temperatura.getTemperaturas();
	}
	
	public String displayData() {
		return this.temperatura.displayData();
	}
}
