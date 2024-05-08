package ejercicio16.ejercicio16;

public class DecoradorPromedio extends Decorator{
	
	public DecoradorPromedio(Temperatura temp) {
		super(temp);
		// TODO Auto-generated constructor stub
	}
	
	
	public String displayData() {
		// TODO Auto-generated method stub
		return super.displayData()+ " Promedio: " +  this.promedioHistoricas();
	}
	
	private double promedioHistoricas() {
		return this.getTemperaturas().stream().mapToDouble(temp-> temp.doubleValue()).average().orElse(0);
	}

}
